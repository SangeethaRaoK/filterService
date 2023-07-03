package com.sangeetha.filterDemo.filteringService.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sangeetha.filterDemo.filteringService.entity.Product;
import com.sangeetha.filterDemo.filteringService.repository.ProductRepository;
import com.sangeetha.filterDemo.filteringService.service.ProductService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class ProsuctServiceImpl  implements ProductService{
	
	private ProductRepository productRepository;

	@Override
	public List<Product> searchProducts(String query) {
		// TODO Auto-generated method stub
		return productRepository.searchProducts(query);
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
