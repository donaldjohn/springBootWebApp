package com.donaldjohn.exprimental.springboot.ch1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloworldController
{
    @RequestMapping("/sayHi.html")
    @ResponseBody
    public String sayHi(HttpSession session)
    {
        String id = session.getId();
        System.out.println("**********session_Id is : " + id);
        return "Hello, spring boot!";
    }
}
