package com.xxxx.controller;

import com.xxxx.domian.User;
import com.xxxx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Resource
    private UserService service;
    /*注册*/
    @RequestMapping("/register.do")
    public String getRegister(User user){
        int n = service.addUser(user);
        if(n>=1){
            return "login.jsp";
        }
        return "fail.jsp";
    }
    /*登录*/
    @RequestMapping("/login.do")
    public String getLogin(User user, HttpSession session){
        String username = user.getUsername();
        String password = user.getPassword();
        List<User> selectUserByAll = service.selectUser();
        for (User u:selectUserByAll
             ) {
            session.setAttribute("user",u);
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return "index.jsp";
            }
        }
        return "fail.jsp";
    }
    /*退出*/
    @RequestMapping("/logout.do")
    public String getLogoyt(){
        return "login.jsp";
    }

}
