package com.zhou.testareo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class typographyController {
    @RequestMapping("/typography.html")
    public String typography(){
        return "typography";
    }
}
