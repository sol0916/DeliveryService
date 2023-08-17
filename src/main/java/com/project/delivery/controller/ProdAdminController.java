package com.project.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prodAdmin")
public class ProdAdminController {

    @GetMapping("/prodList1")
    public String prodList1() {
        return "/prodAdmin/prodList1";
    }

    @GetMapping("/prodList2")
    public String prodList2() {
        return "/prodAdmin/prodList2";
    }

    @GetMapping("/prodList3")
    public String prodList3() {
        return "/prodAdmin/prodList3";
    }


}
