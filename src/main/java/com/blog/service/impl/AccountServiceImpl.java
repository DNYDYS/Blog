package com.blog.service.impl;

import com.blog.mapper.AccountMapper;
import com.blog.model.Account;
import com.blog.model.AccountExample;
import com.blog.service.AccountService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/*
 * @Author maiBangMin
 * @Description [账户管理实现类]
 * @Date 11:01 下午 2020/9/14
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    /** 根据账号名称获取账号信息 */
    @Override
    public Account queryAccountByAccountName(String accName) {
        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria criteria = accountExample.createCriteria();
        if(StringUtils.isNotEmpty(accName)) {
            criteria.andAccNameEqualTo(accName);
        }
        List<Account> accountList = accountMapper.selectByExample(accountExample);
        return accountList.get(0);
    }
}
