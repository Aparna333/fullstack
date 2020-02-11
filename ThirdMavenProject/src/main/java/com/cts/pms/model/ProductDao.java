package com.cts.pms.model;

import java.util.HashMap;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	HashMap<Integer, Product> map = new HashMap<>();
	
	public Integer addProduct(Product product) {
		map.put(product.getProdId(),product);
		return product.getProdId();
	}

}
