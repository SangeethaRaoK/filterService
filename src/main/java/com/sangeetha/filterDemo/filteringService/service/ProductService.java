package com.sangeetha.filterDemo.filteringService.service;

import java.util.List;

import com.sangeetha.filterDemo.filteringService.entity.Product;

public interface ProductService {
	List<Product> searchProducts(String query);

    Product createProduct(Product product);

}
