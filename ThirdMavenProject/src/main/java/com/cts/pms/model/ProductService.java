package com.cts.pms.model;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductDao pDao;
	
	public Integer addProduct(Product product) {
		pDao.addProduct(product);
		return product.getProdId();
		
	}

}
