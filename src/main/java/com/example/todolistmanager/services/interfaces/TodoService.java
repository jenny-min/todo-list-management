package com.example.todolistmanager.services.interfaces;

import com.example.todolistmanager.entities.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();

    Todo save(Todo todo);

    Todo findById(Long id);

    void delete(Long id);
}
