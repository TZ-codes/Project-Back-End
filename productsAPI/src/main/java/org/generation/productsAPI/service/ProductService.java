package org.generation.productsAPI.service;

import org.generation.productsAPI.repository.entity.Product;

import java.util.List;

public interface ProductService {
    Product save( Product product );

    void delete(int productId );

    List<Product> all();

    Product findById(int productId );

}
