package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

public class ProductController {
    // 商品操作サービスのインスタンス（実体）を作ります。このサービスが実際の商品操作を行います。
    private final ProductService productService;

    // '@Autowired'と書いてあるのは、この下に書かれている部分（商品操作サービス）が自動的に準備されるという意味です。
    // このクラス内のどこからでも、この商品操作サービスを利用できるようになります。
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/")
    public String showHomePage(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("productList",products);
        return "index";
    }
}
