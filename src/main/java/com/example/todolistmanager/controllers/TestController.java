package com.example.todolistmanager.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class TestController {
    @GetMapping("dashboard")
    public String loadDashboard() {
        System.out.println("Loading Dashboard");
        return "Dashboard";
    }
}
