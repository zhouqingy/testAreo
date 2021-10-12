package com.zhou.testareo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class iconfontController {
    @RequestMapping("/iconfont.html")
    public String iconfont(){
        return "iconfont";
    }
}
