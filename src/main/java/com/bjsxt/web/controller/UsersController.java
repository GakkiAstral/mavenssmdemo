package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 处理用户操作控制器
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    /**
     * 处理用户qq
     */
    @RequestMapping("/findUsersAll")
    public String findUsersAll(Model model){
        List<Users> list = this.usersService.findUsersAll();
        model.addAttribute("list",list);
        return "showusers";
    }
}
