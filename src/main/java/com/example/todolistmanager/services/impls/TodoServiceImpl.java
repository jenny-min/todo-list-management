package com.example.todolistmanager.services.impls;

import com.example.todolistmanager.entities.Todo;
import com.example.todolistmanager.repositories.TodoRepository;
import com.example.todolistmanager.services.interfaces.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepository tr;

    @Override
    public List<Todo> getAllTodos() {
        return tr.findAll();
    }

    @Override
    public Todo save(Todo todo) {
        return tr.save(todo);
    }

    @Override
    public Todo findById(Long id) {
        return tr.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    @Override
    public void delete(Long id) {
        tr.deleteById(id);
    }
}
