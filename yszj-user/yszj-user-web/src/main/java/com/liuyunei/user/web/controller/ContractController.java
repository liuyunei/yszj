package com.liuyunei.user.web.controller;

import com.liuyunei.common.base.BaseController;
import com.liuyunei.user.common.constant.UserResult;
import com.liuyunei.user.common.constant.UserResultConstant;
import com.liuyunei.user.dao.model.UcUser;
import com.liuyunei.user.dao.model.UcUserContract;
import com.liuyunei.user.dao.model.UcUserContractExample;
import com.liuyunei.user.rpc.api.UcUserContractService;
import com.liuyunei.user.rpc.api.UcUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Date: Created in 2018/6/12
 */
@Controller
@RequestMapping("/contract")
public class ContractController extends BaseController {

    //打印提示信息
    private static final Logger LOGGER = LoggerFactory.getLogger(ContractController.class);

    @Autowired
    private UcUserContractService ucUserContractService;

    @Autowired
    private UcUserService ucUserService;
    //首页
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexContract(HttpServletRequest request, Model model){

        return thymeleaf("/index");
    }
    //新闻
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String newsContract(HttpServletRequest request, Model model){

        return thymeleaf("/news");
    }
    //合同案例
    @RequestMapping(value = "/case", method = RequestMethod.GET)
    public String caseContract(HttpServletRequest request, Model model){

        return thymeleaf("/case");
    }

    //已签合同
    @RequestMapping(value ="/alreadyselect", method = RequestMethod.GET)
    public String getContract1(HttpServletRequest request, Model model, UcUserContract ucUserContract){
//       String username = request.getSession().getAttribute("username").toString();
        String userId1="liuxing";
        UcUserContractExample ucUserContractExample=new UcUserContractExample();
        List<UcUserContract> lists= ucUserContractService.selectByExample(ucUserContractExample);
        List<UcUserContract> list2=new ArrayList<UcUserContract>();

        for( int i = 0; i<lists.size();i++){
             ucUserContract = lists.get(i);

            if (ucUserContract.getUserId1().equals(userId1))
            {
                list2.add(ucUserContract);
                System.out.println("ucUserContract"+i+":"+ucUserContract);
            }
//            if (ucUserContract.getUserId2().equals(userId1)&&ucUserContract.getContractStatus().equals(1))
//            {
//                list2.add(ucUserContract);
//            }

        }
        model.addAttribute("list",list2);
        return thymeleaf("/hacontract");
    }
    //待签合同
    @RequestMapping(value ="/waitselect", method = RequestMethod.GET)
    public String getContract2(HttpServletRequest request, Model model){
        UcUserContract ucUserContract=new UcUserContract();
       // String userId1 = request.getSession().getAttribute("username").toString();
        String userId1="132123";
        UcUserContractExample ucUserContractExample=new UcUserContractExample();
        List<UcUserContract> lists= ucUserContractService.selectByExample(ucUserContractExample);
        List<UcUserContract> list2=new ArrayList<UcUserContract>();
        for( int i = 0; i<lists.size();i++){
            ucUserContract = lists.get(i);
            if (ucUserContract.getUserId2().equals(userId1)&&ucUserContract.getContractStatus().equals(0))
            {
                list2.add(ucUserContract);
                System.out.println(ucUserContract);
            }
        }
        model.addAttribute("list",list2);
        return thymeleaf("/uncontract");
    }


    //删除合同
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public Object delContract(HttpServletRequest request, Model model,Integer id){
        String gid = request.getParameter("id");
        System.out.println("gid:"+gid);
       ucUserContractService.deleteContract(gid);
        System.out.println("删除成功");
        return new UserResult(UserResultConstant.SUCCESS, 1);
    }

    //发起合同
    @RequestMapping(value = "/upload2", method = RequestMethod.GET)
    public String createContract(HttpServletRequest request, Model model){

        return thymeleaf("/signingcontract");
    }
    @RequestMapping(value = "/upload2", method = RequestMethod.POST)
    @ResponseBody
    public Object upload2(HttpServletRequest request) {
        Date date1=new Date();
//        String userId1=request.getSession().getAttribute("username").toString();
        String userId1="liuxing";
        String userId2=request.getParameter("userId2");
        String contractTitle=request.getParameter("contractTitle");
        String filename=request.getParameter("filename");
       UcUser ucUser= ucUserService.queryUserByUsername(userId1);
        System.out.println("ucuser:"+ucUser);
        System.out.println("请求保存文件到硬盘");
        String url = "F:/upload/" + userId1 + "/";
        url+= "/" + filename;
//        try{
//            if (!filename.isEmpty()) {
//                File file = new File(url);
//                if (!file.isDirectory() && !file.exists()) {
//                    file.mkdir();
//                }
//                InputStream is = filename.getInputStream();
//                String name = filename.getOriginalFilename();
//                url+= "/" + name;
//                FileOutputStream fileOutputStream = new FileOutputStream(url);
//                byte[] b = new byte[is.available()];
//                is.read(b);
//                fileOutputStream.write(b);
//            } else {
//                System.out.println("添加单个文件" + url + "失败！");
//                return false;
//            }
//            date1.toLocaleString();
//            UcUserContract u=new UcUserContract();
//            u.setContractId(1001);
//            u.setUserId1("1@333");
//            u.setUserId2("12324");
//            u.setContractTime1(date1);
//            u.setContractTitle("ffggg");
//            u.setKey1( ucUser.getPriKey());
//            u.setContractCms(url);
//            u.setContractStatus(1);
//            ucUserContractService.insertSelective(u);
//
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//
//            return false;
//        }
        date1.toLocaleString();
        UcUserContract u=new UcUserContract();
        String uuid= UUID.randomUUID().toString();
        u.setContractId(uuid);
        u.setUserId1(userId1);
        u.setUserId2(userId2);
        u.setContractTime1(date1);
        u.setContractTitle(contractTitle);
        u.setKey1(ucUser.getPriKey());
        u.setContractCms(url);
        u.setContractStatus(0);
        System.out.println("u:"+u);
        ucUserContractService.createContract(u);
        return new UserResult(UserResultConstant.SUCCESS, 1);
    }


    //签署合同

    @RequestMapping(value = "/sure", method = RequestMethod.POST)
    @ResponseBody
    public Object sureContract(HttpServletRequest request, Model model,Integer id){
       String userId1="liuxing";
        //      String userId1=request.getSession().getAttribute("username").toString();
        String gid = request.getParameter("id");
        System.out.println("gid:"+gid);
        UcUserContract ucUserContract=new UcUserContract();
        ucUserContract=ucUserContractService.queryUserCountByUserId(gid);
        System.out.println("ucUserContract:"+ucUserContract);
        ucUserContract.setContractStatus(1);
        UcUser ucUser= ucUserService.queryUserByUsername(userId1);
        ucUserContract.setKey2(ucUser.getPriKey());
        System.out.println("ucUserContract:"+ucUserContract);
        ucUserContractService.updateByPrimaryKey(ucUserContract);
        System.out.println("签署成功");
        return new UserResult(UserResultConstant.SUCCESS, 1);
    }

    //拒绝签署合同

    @RequestMapping(value = "/refuse", method = RequestMethod.POST)
    @ResponseBody
    public Object refuseContract(HttpServletRequest request, Model model,Integer id){
        String gid = request.getParameter("id");
        System.out.println("gid:"+gid);
        UcUserContract ucUserContract=new UcUserContract();
        ucUserContract=ucUserContractService.queryUserCountByUserId(gid);
        System.out.println("ucUserContract:"+ucUserContract);
        ucUserContract.setContractStatus(-1);
        System.out.println("ucUserContract:"+ucUserContract);
        ucUserContractService.updateByPrimaryKey(ucUserContract);
        System.out.println("签署成功");
        return new UserResult(UserResultConstant.SUCCESS, 1);
    }











}
