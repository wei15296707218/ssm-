package com.ssw.test;


import com.ssw.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:Wss
 * @Date:2019/11/1 0001
 * @Description:com.ssw.test
 * @version: 1.0
 */
public class TestSpring {
    @Test
    public void test(){
        //1.加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2.获取对象
      IAccountService as =(IAccountService)ac.getBean("accountService");
      //调用方法
        as.findAll();
    }
}
