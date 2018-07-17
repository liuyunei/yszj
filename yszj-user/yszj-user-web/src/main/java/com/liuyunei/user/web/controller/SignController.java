package com.liuyunei.user.web.controller;

import com.liuyunei.common.base.BaseController;
import com.liuyunei.common.util.MD5Util;
import com.liuyunei.user.common.constant.UserResult;
import com.liuyunei.user.common.constant.UserResultConstant;
import com.liuyunei.user.dao.model.UcUser;
import com.liuyunei.user.rpc.api.UcUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 注册控制器
 * Created by liuyunei on 2017/5/2.
 */
@Controller
public class SignController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SignController.class);
    @Autowired
    private UcUserService ucUserService;
    //用户注册
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        return thymeleaf("/reg");
}
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseBody
    public Object signup(HttpServletRequest request, UcUser ucUser) {
        String userId=request.getParameter("userId");
        String password = request.getParameter("password");
        ucUser.setUserId(userId);
        ucUser.setPassword(password);
        System.out.println(" 账号： "+userId+"密码："+password);
        Date date=new Date();
        date.toLocaleString();
        String salt=UUID.randomUUID().toString().replace("-","");
        ucUser.setSalt(salt);
        ucUser.setPassword(MD5Util.md5(ucUser.getPassword()+ucUser.getSalt()));
        ucUser.setCreateTime(date);
        ucUser.setPriKey(MD5Util.md5(ucUser.getUserId()));
        ucUser = ucUserService.createUser(ucUser);
        if (null == ucUser) {
            System.out.println("用户注册失败");
            return new UserResult(UserResultConstant.FAILED, "帐号名已存在！");
        }
        System.out.println("执行结束，用户注册成功");
        System.out.println(ucUser);
        LOGGER.info("新增用户，主键：userId={}", ucUser.getUserId());
        return new UserResult(UserResultConstant.SUCCESS, 1);

    }
        //用户登录
        @RequestMapping(value = "/signin", method = RequestMethod.GET)
        public String signin(Model model) {
            return thymeleaf("/login");
        }

        @RequestMapping(value = "/signin", method = RequestMethod.POST)
        @ResponseBody
        public Object signin(Model model,HttpServletRequest request,UcUser ucUser) {
            System.out.println("jinrudenlu");
            String username=request.getParameter("username");
            String password = request.getParameter("password");
            //用户存在时
            if(ucUserService.queryUserCountByUserId(username)!=0)
            {
                UcUser ucUserTemp=ucUserService.queryUserByUsername(username);
                String salt=ucUserTemp.getSalt();
                String md5Password=MD5Util.md5(password+salt);
                if(!md5Password.equals(ucUserTemp.getPassword()))
                {
                    System.out.println("密码错误");
                    return new UserResult(UserResultConstant.FAILED, 0);
                }
                else
                {
                    System.out.println("密码正确");
                    request.getSession().setAttribute("username",username);
                    return new UserResult(UserResultConstant.SUCCESS, 1);
                }
            }
            else {//用户不存在
                return new UserResult(UserResultConstant.FAILED, 0);
            }

    }
            //退出登录
            @RequestMapping(value = "/signout", method = RequestMethod.GET)
            public String index(HttpServletRequest request) {
                //得到所有的属性名
                Enumeration enumeration=request.getSession().getAttributeNames();
                if(enumeration.hasMoreElements())
                {
                    request.getSession().removeAttribute(enumeration.nextElement().toString());
                };
                return thymeleaf("/login");
            }
            //修改密码
            @RequestMapping(value = "/password_reset", method = RequestMethod.GET)
            public String passwordReset(Model model) {
                return thymeleaf("/modify_password");
            }
            @RequestMapping(value = "/password_reset", method = RequestMethod.POST)
            @ResponseBody
            public Object passwordReset(HttpServletRequest request) {
                // 根据用户名查询用户信息
                String username = request.getSession().getAttribute("username").toString();
                System.out.println("" + username);
                UcUser ucUser = ucUserService.queryUserByUsername(username);
                //得到数据库中原密码
                String ypassword=ucUser.getPassword();
                System.out.println(ypassword);
                //生成yan值，加密//得到前端的原密码
                String jpassword = request.getParameter("password");
                System.out.println(jpassword);
                String ysalt=ucUser.getSalt();
                //前端得到的密码加盐值
                String jpassword1 = MD5Util.md5(jpassword + ysalt);
                //判断原密码是否正确
                System.out.println(jpassword1);
                if(!jpassword1.equals(ypassword))
                {
                    System.out.println("原密码不一致");
                    return false;
                }else{
                    //生成yan值，加密
                    String salt = UUID.randomUUID().toString().replace("-", "");
                    //得到前端的修改密码，进行加盐值
                    String password = request.getParameter("password1");
                    String md5Password = MD5Util.md5(password + salt);
                    //设置yan值，set密码.
                    ucUser.setSalt(salt);
                    ucUser.setPassword(md5Password);
                    System.out.println(md5Password);
                    //修改user,返回1就说明成功
                    if (ucUserService.updateByPrimaryKey(ucUser) == 1)
                    {
                        System.out.println("修改成功");
                    }else
                    {
                        System.out.println("修改不成功");
                    }
                }
                return new UserResult(UserResultConstant.SUCCESS, 1);
            }
            // 找回密码
            @RequestMapping(value = "/getPassword", method = RequestMethod.GET)
            public String password(Model model) {

                return thymeleaf("/password");
            }
            @RequestMapping(value = "/getPassword", method = RequestMethod.POST)
            @ResponseBody
            public Object getPassword(HttpServletRequest request){
                //根据用户名查询用户信息
                String username = request.getParameter("username");
                System.out.println("" + username);
                UcUser ucUser = ucUserService.queryUserByUsername(username);
                //从数据库得到密保问题和答案
                String que=ucUser.getQuestion();
                String ans=ucUser.getAnswer();
                //从前台得到数据
                String question=request.getParameter("question");
                String answer=request.getParameter("answer");
                if(que.equals(question)&&ans.equals(answer))
                {
                     System.out.println("找回密码成功,进入密码修改界面");
                    return thymeleaf("signin");
                }else{
                    System.out.println("输入不正确，找回密码失败");

                }
                return new UserResult(UserResultConstant.SUCCESS, 1);
            }
    // 找回密码
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexpassword(Model model) {

        return thymeleaf("/index");
    }
}