package com.example.todolistmanager.services.impls;

import com.example.todolistmanager.entities.Todo;
import com.example.todolistmanager.services.interfaces.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Override
    public List<Todo> getAllTodos() {
        return List.of();
    }

    @Override
    public Todo save(Todo todo) {
        return null;
    }

    @Override
    public Todo findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
