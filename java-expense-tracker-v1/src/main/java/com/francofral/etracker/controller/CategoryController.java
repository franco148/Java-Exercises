package com.francofral.etracker.controller;

import com.francofral.etracker.domain.Category;
import com.francofral.etracker.repository.CategoryRepository;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody @NotBlank String category) {
        var newCategory = new Category();
        newCategory.setName(category);

        categoryRepository.save(newCategory);
    }

    @PutMapping("/{category_id}")
    public void update(@PathVariable("category_id") Long id, @RequestBody @NotBlank String updatedCategory) {
        var category = categoryRepository.findById(id);

        if (category.isEmpty()) {
            throw new RuntimeException("Category with id=" + id + "does not exist.");
        }

        category.get().setName(updatedCategory);
        categoryRepository.save(category.get());
    }
}
