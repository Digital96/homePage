package com.djt.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping("/home")
    public String index(){
        // return模板文件的名称，对应src/main/resources/templates/welcome.html
        return "welcome";
    }
}
