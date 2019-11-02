package com.ssw.dao;

import com.ssw.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @Auther:Wss
 * @Date:2019/11/1 0001
 * @Description:com.ssw.dao
 * @version: 1.0
 */
@Repository
public interface IAccountDao {
    //查询所有
    @Select("select * from account")
   public  List<Account> findAll();
   //保存账户信息
    @Insert("insert into account (name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}
