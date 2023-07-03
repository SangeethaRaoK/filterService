package com.sangeetha.filterDemo.filteringService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangeetha.filterDemo.filteringService.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
	@Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);

}
