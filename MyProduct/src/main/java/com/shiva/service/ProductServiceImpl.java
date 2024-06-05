package com.shiva.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shiva.entity.Product;
import com.shiva.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{


	private ProductRepository productRepo;
	
	
	public ProductServiceImpl(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepo.findById(id).get();
	}

	@Override
	public List<Product> fetchAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public boolean deleteProduct(Integer id) {
		Product product = productRepo.findById(id).get();
		if (product!=null) {
			productRepo.deleteById(id);
			return true;
		}
		return false;

	}

}
