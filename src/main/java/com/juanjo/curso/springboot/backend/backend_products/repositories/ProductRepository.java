package com.juanjo.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.juanjo.curso.springboot.backend.backend_products.entities.Product;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {

}
