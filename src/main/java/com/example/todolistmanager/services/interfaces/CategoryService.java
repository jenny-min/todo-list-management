package com.example.todolistmanager.services.interfaces;

import com.example.todolistmanager.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> getAllCategories();

    Category save(Category category);

    void delete(Long id);

    Category findById(Long id);
}
