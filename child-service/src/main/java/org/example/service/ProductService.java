package org.example.service;

import org.example.dao.ProductDAO;
import org.example.model.Product;

import java.util.List;

public class ProductService {
    private ProductDAO productDao = new ProductDAO();

    public ProductService() {
    }

    public String insertProduct(Product product) {
        product.setName("Lars Test");
        return productDao.insertProduct(product);
    }

    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }


}
