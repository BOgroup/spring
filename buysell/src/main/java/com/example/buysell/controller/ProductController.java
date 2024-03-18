package com.example.buysell.controller;

import com.example.buysell.models.Product;
import com.example.buysell.services.ProductServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor

public class ProductController {

    private final ProductServices productServices;

    @GetMapping("/")
    public String products(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("products", productServices.listProduct(title));
        return "products";
    }

    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model) {
        model.addAttribute("product", productServices.getProductByID(id));
        return "product-info";
    }

    @PostMapping("/product/create")
    public String createProduct(@ModelAttribute Product product) {
        productServices.saveProduct(product);
        return "redirect:/";
    }


    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productServices.deleteProduct(id);
        return "redirect:/";
    }
}
