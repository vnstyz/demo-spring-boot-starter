package org.example.springbootsingleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @RequestMapping("/test2")
    public String test2(Map<String, Object> map) {
        map.put("message", "<h1>Hello</h1>");
        map.put("users", Arrays.asList("qinjiang","kuangshen"));
        return "index";
    }

    @GetMapping("/i18n")
    public String test3() {
        String message = messageSource.getMessage("success", null ,Locale.ENGLISH);
        System.out.println(message);
        return "index";
    }
}
