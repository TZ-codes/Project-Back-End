package org.generation.productsAPI.service;

import org.generation.productsAPI.repository.entity.ProductRepository;
import org.generation.productsAPI.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceMySQL implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceMySQL(ProductRepository productRepository ) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save( Product product ) {
        //TODO implement this method
        return productRepository.save(product);
    }

    @Override
    public void delete(int productId ) {
        //TODO implement this method
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> all() {
        //TODO implement this method
        List<Product> result = new ArrayList<>();
        productRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Product findById(int productId ) {
        //TODO implement this method
        Optional<Product> product = productRepository.findById(productId);
        return product.orElse(null);
    }
}
