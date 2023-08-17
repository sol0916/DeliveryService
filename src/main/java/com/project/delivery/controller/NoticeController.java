package com.project.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("/noticeReg")
    public String noticeReg() {
        return "/notice/noticeReg";
    }

    @GetMapping("/noticeList")
    public String noticeList() {
        return "/notice/noticeList";
    }

}
