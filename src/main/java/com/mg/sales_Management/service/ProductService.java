package com.mg.sales_Management.service;

import java.util.List;
import java.util.stream.Collectors;

import com.mg.sales_Management.dto.ProductDTO;
import com.mg.sales_Management.model.Product;

public class ProductService {
    private List<Product> products = List.of(
            new Product(001, "Support Ordinateur", 30000.0),
            new Product(001, "Tasse Chauffante", 30000.0)

    );

    private ProductDTO convertToDTO(Product product) {
        return new ProductDTO(product.getId(), product.getDesignation(), product.getPrixUnitaire());
    }

    public List<ProductDTO> getProduct() {
        return products.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

}
