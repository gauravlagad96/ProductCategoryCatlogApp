package com.catalogmanager.service;

import com.catalogmanager.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
	Page<Product> getAllProducts(Pageable pageable);

	Product getProductById(Long id);

	Product createProduct(Product product);

	Product updateProduct(Long id, Product product);

	void deleteProduct(Long id);
}
