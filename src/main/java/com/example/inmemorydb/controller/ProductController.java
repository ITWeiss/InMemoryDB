package com.example.inmemorydb.controller;

import com.example.inmemorydb.entity.Product;
import com.example.inmemorydb.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping("/add-product")
    @ResponseBody
    public Product createProduct(@RequestParam("name") String name, @RequestParam("price") double price) {
        return productService.createProduct(name, price);
    }
}
