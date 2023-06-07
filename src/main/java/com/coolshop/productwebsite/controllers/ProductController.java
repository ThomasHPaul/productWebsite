package com.coolshop.productwebsite.controllers;

import com.coolshop.productwebsite.models.Product;
import com.coolshop.productwebsite.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> list() { return productRepository.findAll(); }

    @GetMapping
    @RequestMapping("{id}")
    public Product get(@PathVariable Long id) { return productRepository.findById(id).get(); }

    @PostMapping
    public Product create(@RequestBody final Product product) { return productRepository.saveAndFlush(product); }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        // TODO: Add validation that all attributes are passed in, otherwise return a 400 bad payload
        Product existingProduct = productRepository.findById(id).get();
        BeanUtils.copyProperties(product, existingProduct, "productId");
        return productRepository.saveAndFlush(existingProduct);
    }
}
