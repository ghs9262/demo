package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {

    private Student student;

    @RequestMapping("/hello")


    public String hello(Model model) {
        model.addAttribute("date",         DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
