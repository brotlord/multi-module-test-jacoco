package org.example.dao;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private List<Product> db = new ArrayList<>();

    public String insertProduct(Product product) {
        db.add(new Product(product.getId(), product.getName(), product.getPrice()));
        return "Insert successful";
    }

    public List<Product> getAllProducts() {
        return db;
    }
}

