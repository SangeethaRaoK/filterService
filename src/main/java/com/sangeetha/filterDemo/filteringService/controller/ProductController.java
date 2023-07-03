package com.sangeetha.filterDemo.filteringService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sangeetha.filterDemo.filteringService.entity.Product;
import com.sangeetha.filterDemo.filteringService.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
	
	private ProductService productService;
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
	
	@GetMapping("/search")
	public List<Product> searchProducts(@RequestParam("query") String query){
		return productService.searchProducts(query);
	}

}
