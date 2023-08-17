package com.project.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/main")
    public String main() { return "mainpage2";}

    @GetMapping("/test")
    public String test() {return "test";}

//    @GetMapping("prodList1")
//    public String plist1() {return "prodList1";}

}
