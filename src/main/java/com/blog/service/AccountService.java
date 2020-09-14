package com.blog.service;


import com.blog.model.Account;

/*
 * @Author maiBangMin
 * @Description [账户管理]
 * @Date 11:00 下午 2020/9/14
 * @Version 1.0
 **/
public interface AccountService {

    /** 根据账号名称获取账号信息 */
    Account queryAccountByAccountName(String accName);



}
