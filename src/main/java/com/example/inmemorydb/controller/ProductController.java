package com.example.inmemorydb.controller;

import com.example.inmemorydb.entity.ProductEntity;
import com.example.inmemorydb.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Контроллер для работы с продуктами {@link ProductEntity}
 *
 * @author ITWeiss
 */
@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public String getAllProducts(Model model) {
        List<ProductEntity> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping
    @ResponseBody
    public ProductEntity createProduct(@RequestParam("name") String name, @RequestParam("price") double price) {
        return productService.createProduct(name, price);
    }
}
