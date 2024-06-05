package com.shiva.service;

import java.util.List;

import com.shiva.entity.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	
	public Product getProductById(Integer id);
	
	public List<Product> fetchAllProducts();
	
	public boolean deleteProduct(Integer id);
	

}
