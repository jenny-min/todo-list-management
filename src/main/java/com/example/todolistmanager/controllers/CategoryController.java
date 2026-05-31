package com.example.todolistmanager.controllers;

import com.example.todolistmanager.entities.Category;
import com.example.todolistmanager.services.interfaces.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("categories")
public class CategoryController {
    private final CategoryService ct;

    @GetMapping
    public String loadDashboard(Model model) {
        model.addAttribute("categories", ct.getAllCategories());
        return "categories/CategoryManager";
    }

    @GetMapping("/create")
    private String createCategory(Model model) {
        model.addAttribute("category", new Category());
        return "categories/CreateCategory";
    }

    @PostMapping()
    public String save(@ModelAttribute("category") Category category) {
        ct.save(category);
        return "redirect:/categories";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        ct.delete(id);
        return "redirect:/categories";
    }

    @GetMapping("/edit/{id}")
    private String editCategory(@ModelAttribute("id") Long id, Model model) {
        Category category = ct.findById(id);
        model.addAttribute("category", category);
        return "categories/EditCategory";
    }

    @PostMapping("/save")
    public String saveEdit(@ModelAttribute("category") Category category) {
        ct.save(category);
        return "redirect:/categories";
    }
}
