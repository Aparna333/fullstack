package com.cts.util;

public interface IQueryMapper {
	public static final String PRODUCT_INSERT_QRY = "INSERT INTO Product values(?,?,?,?)";
	public static final String FIND_BY_ID_QRY = "SELECT * FROM Product WHERE prod_id=?";
	public static final String FIND_ALL_PRODUCTS_QRY = "SELECT * FROM Product";
}
