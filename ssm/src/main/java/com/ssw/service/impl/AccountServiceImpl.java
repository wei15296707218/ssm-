package com.ssw.service.impl;

import com.ssw.dao.IAccountDao;
import com.ssw.domain.Account;
import com.ssw.service.IAccountService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:Wss
 * @Date:2019/11/1 0001
 * @Description:com.ssw.service.impl
 * @version: 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("查询所有");
       return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
