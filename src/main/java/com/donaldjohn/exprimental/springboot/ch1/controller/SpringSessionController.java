package com.donaldjohn.exprimental.springboot.ch1.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SpringSessionController
{
    Log log = LogFactory.getLog(SpringSessionController.class);
    @RequestMapping("/outputSessionInfo.html")
    @ResponseBody
    public String putSession(HttpServletRequest request)
    {
        HttpSession httpSession = request.getSession();
        log.info("***********************" + httpSession.getId());
        log.info("***********************" + httpSession.getClass());

        httpSession.setAttribute("user", "donaldjohn");

        return "hello, donaldjohn!";
    }
}
