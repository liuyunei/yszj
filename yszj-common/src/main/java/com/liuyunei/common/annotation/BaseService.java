package com.liuyunei.common.annotation;

import java.lang.annotation.*;

/**
 * Author: 刘兴
 * Date: Created in 2018/4/23
 */
//用于描述类、接口(包括注解类型) 或enum声明的元注解，定义注解使用范围
@Target({ElementType.TYPE})
//定义注解存在时间长短，定义为运行时启动该注解
@Retention(RetentionPolicy.RUNTIME)
//标记注解
@Documented
//自定义注解
public @interface BaseService {
}
