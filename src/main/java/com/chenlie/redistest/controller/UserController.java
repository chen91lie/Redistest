package com.chenlie.redistest.controller;

import com.chenlie.redistest.pojo.Users;
import com.chenlie.redistest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/go")
    @ResponseBody
    public List<Users> get(){
        List<Users> list = userService.getAll();
        return  list;
    }
    @RequestMapping("/gogo")
    public String getUser(HttpSession session){
        List<Users> list = userService.getAll();
        session.setAttribute("users",list);
        session.setAttribute("name","你麻痹");
        return "demo2.html";
    }
}
