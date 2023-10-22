/*package com.proyectosi1.apirest.controller;

public class Egreso_ProductoController {
    
}*/
package com.proyectosi1.apirest.controller;

import com.proyectosi1.apirest.entity.CategoryEntity;

import com.proyectosi1.apirest.service.CategoryService;
import com.proyectosi1.apirest.service.Egreso_ProductoService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Egreso_Producto")
@RequiredArgsConstructor
public class Egreso_ProductoController {
    private final Egreso_ProductoService egreso_ProductoService;
    /* 
    @PostMapping
    public CategoryEntity createCategory(@RequestBody CategoryEntity category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public CategoryEntity updateCategory(@PathVariable Integer id, @RequestBody CategoryEntity category) {
        category.setId(id);
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Integer id) {
        categoryService.deleteCategory(id);
    }

    @GetMapping("/{id}")
    public CategoryEntity getCategory(@PathVariable Integer id) {
        return categoryService.getCategoria(id);
    }

    @GetMapping
    public List<CategoryEntity> getAllCategory() {
        return categoryService.getAllCategories();
    }*/
}

