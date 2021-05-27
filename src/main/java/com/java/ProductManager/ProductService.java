package com.java.ProductManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired // to inject an instance of productrepository
	private ProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}
	public void save(Product product) {
		repo.save(product);
	}
	public Product get(Long id) {
		return repo.findById(id).get();
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
