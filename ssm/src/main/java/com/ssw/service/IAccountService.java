package com.ssw.service;

import com.ssw.domain.Account;

import java.util.List;

/**
 * @Auther:Wss
 * @Date:2019/11/1 0001
 * @Description:com.ssw.service
 * @version: 1.0
 */
public interface IAccountService {

    //查询所有
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}
