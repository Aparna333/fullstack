package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.Product;
import com.cts.util.DbUtil;
import com.cts.util.IQueryMapper;
public class ProductDao {
	
	public int addProduct(Product pdt) throws SQLException{
		Connection conn=DbUtil.getConnectionForDb();
		PreparedStatement pst=conn.prepareStatement(IQueryMapper.PRODUCT_INSERT_QRY);
		pst.setInt(1, pdt.getProdId());
		pst.setString(2, pdt.getProdName());
		pst.setInt(3, pdt.getQuantity());
		pst.setFloat(4,pdt.getPrice());
		int prodId=0;
		prodId=pst.executeUpdate();
		if(prodId>0){
			prodId=pdt.getProdId();
		}
		return prodId;
	}
	
	public Product getProductById(int pdtId) throws SQLException{
		
		Connection conn=DbUtil.getConnectionForDb();
		PreparedStatement pst=conn.prepareStatement(IQueryMapper.FIND_BY_ID_QRY);
		pst.setInt(1,pdtId);
		ResultSet ts=pst.executeQuery();
		Product p=null;
		if(ts.next()){
			p=new Product(ts.getInt(1),ts.getString(2),ts.getInt(3),ts.getFloat(4));
		}
		return p;
	}
	
	public List<Product> getAllProducts() throws SQLException{
		
		Connection conn=DbUtil.getConnectionForDb();
		PreparedStatement pst=conn.prepareStatement(IQueryMapper.FIND_ALL_PRODUCTS_QRY);
		ResultSet ts=pst.executeQuery();
		Product p=null;
		List<Product> pList=new ArrayList<>();
		while(ts.next()){
			p=new Product(ts.getInt(1),ts.getString(2),ts.getInt(3),ts.getFloat(4));
			pList.add(p);
		}
		return pList;
	}

}
