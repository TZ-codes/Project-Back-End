package org.generation.productsAPI.repository.entity;

import org.springframework.data.repository.CrudRepository;
import org.generation.productsAPI.repository.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
