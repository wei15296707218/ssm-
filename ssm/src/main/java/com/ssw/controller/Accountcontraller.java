package com.ssw.controller;

import com.ssw.domain.Account;
import com.ssw.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Auther:Wss
 * @Date:2019/11/1 0001
 * @Description:com.ssw.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/account/")
public class Accountcontraller {
    @Autowired
    IAccountService accountService;

    /*
    查询所有
     */
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        System.out.println("查询所有!");
        model.addAttribute("list",list);
        return "list";
    }

    /*
    保存
     */
    @RequestMapping("save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
       accountService.saveAccount(account);
       response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
