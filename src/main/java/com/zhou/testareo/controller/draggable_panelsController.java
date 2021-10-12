package com.zhou.testareo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class draggable_panelsController {
    @RequestMapping("/draggable_panels.html")
    public String draggable_panels(){
        return "draggable_panels";
    }
}
