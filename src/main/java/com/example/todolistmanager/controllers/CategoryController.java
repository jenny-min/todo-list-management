package com.example.todolistmanager.controllers;

import com.example.todolistmanager.entities.Category;
import com.example.todolistmanager.services.interfaces.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("categories")
public class CategoryController {
    private final CategoryService ct;

    @GetMapping
    public String loadDashboard(Model model) {
        model.addAttribute("categories", ct.getAllCategories());
        return "CategoryManager";
    }

    @GetMapping("/create")
    private String createCategory(Model model) {
        model.addAttribute("category", new Category());
        return "CreateCategory";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("category") Category category) {
        ct.save(category);
        return "redirect:/categories";
    }
}
