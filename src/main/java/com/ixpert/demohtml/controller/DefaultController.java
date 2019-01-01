package com.ixpert.demohtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping(value = {"/", "/home"})
    public String home(){
        return "/home";
    }

    @GetMapping("/page1_1")
    public String page1_1(){
        return "/page1_1";
    }

    @GetMapping("/page1_2")
    public String page1_2(){
        return "/page1_2";
    }

    @GetMapping("/page1_3")
    public String page1_3(){
        return "/page1_3";
    }

    @GetMapping("/page2")
    public String page2(){
        return "/page2";
    }

    @GetMapping("/page3")
    public String page3(){
        return "/page3";
    }


}
