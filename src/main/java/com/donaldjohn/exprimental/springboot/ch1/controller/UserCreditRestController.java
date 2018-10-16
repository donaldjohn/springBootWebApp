package com.donaldjohn.exprimental.springboot.ch1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCreditRestController
{
    
    @RequestMapping("/userCredit/{id}")
    public Integer getUserCreditLevel(@PathVariable(name = "id") String id)
    {
        return 3;
    }
}
