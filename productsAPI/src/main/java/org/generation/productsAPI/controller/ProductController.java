package org.generation.productsAPI.controller;

import org.generation.productsAPI.controller.dto.ProductDto;
import org.generation.productsAPI.repository.entity.Product;
import org.generation.productsAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.generation.productsAPI.repository.entity.ProductRepository;



@RestController
@RequestMapping("/product")
public class ProductController {

    //This is commented out b/c its not the in the example ItemController.java file.
//    final ProductRepository productRepository;

    final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public Iterable<Product> getProducts() {
        return productService.all();
    }

    @CrossOrigin("*")
    @PostMapping
    public Product save( @RequestBody ProductDto productDto ) {
        return productService.save(new Product(productDto));
    }

    @CrossOrigin("*")
    @GetMapping( "/{id}" )
    public Product findItemById( @PathVariable Integer id ) {
        return productService.findById( id );
    }

    @CrossOrigin("*")
    @PutMapping( "/{id}" )
    public Product update( @RequestBody ProductDto productDto, @PathVariable Integer id ) {
        Product product = productService.findById( id );
        product.setName( productDto.getName() );
        product.setDescription( productDto.getDescription() );
        product.setImageUrl( productDto.getImageUrl() );
        return productService.save( product );
    }

    @CrossOrigin("*")
    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id ) {
        productService.delete( id );
    }
}
