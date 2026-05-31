package com.example.todolistmanager.controllers;

import com.example.todolistmanager.entities.Todo;
import com.example.todolistmanager.services.interfaces.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("todos")
public class TodoController {
    private final TodoService ts;
    @GetMapping()
    public String todos(Model model) {
        model.addAttribute("todos", ts.getAllTodos());
        return "todos/Todo";
    }

    @GetMapping("/create")
    public String editTodo(Model model) {
        model.addAttribute("todo", new Todo());
        return "todos/Create";
    }

    @PostMapping()
    public String save(@ModelAttribute("todo") Todo todo) {
        ts.save(todo);
        return "redirect:/todos";
    }
}
