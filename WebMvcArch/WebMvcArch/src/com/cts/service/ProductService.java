package com.cts.service;

import java.sql.SQLException;
import java.util.List;

import com.cts.dao.ProductDao;
import com.cts.model.Product;

public class ProductService {
	
	private ProductDao edao=null;
	
	public int addProduct(Product pdt) throws SQLException{
		edao=new ProductDao();
		//validation logic to be done here
		return edao.addProduct(pdt);
	}
	
	public Product getProductById(int pdtId) throws SQLException{
		edao=new ProductDao();
		return edao.getProductById(pdtId);
	}
	
	public List<Product> getAllProducts() throws SQLException{
		edao=new ProductDao();
		return edao.getAllProducts(); 
	}
}
