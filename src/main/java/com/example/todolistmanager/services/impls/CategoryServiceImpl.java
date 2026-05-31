package com.example.todolistmanager.services.impls;

import com.example.todolistmanager.entities.Category;
import com.example.todolistmanager.repositories.CategoryRepository;
import com.example.todolistmanager.services.interfaces.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository cr;
    @Override
    public List<Category> getAllCategories() {
        return cr.findAll();
    }

    @Override
    public Category createCategory(Category newCategory) {
        return cr.save(newCategory);
    }

    @Override
    public Category save(Category category) {
        return cr.save(category);
    }

    @Override
    public void delete(Long id) {
        cr.deleteById(id);
    }

    @Override
    public Category findById(Long id) {
        return cr.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }
}
