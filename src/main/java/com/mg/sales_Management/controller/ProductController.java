package com.mg.sales_Management.controller;

import com.mg.sales_Management.service.ProductService;

public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

}
