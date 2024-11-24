package com.catalogmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogmanager.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
