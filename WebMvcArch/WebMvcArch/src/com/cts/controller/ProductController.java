package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.model.Product;
import com.cts.service.ProductService;

@WebServlet("/productControl.do")
public class ProductController extends HttpServlet {
	
	private ProductService pServ=null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get input
		String name=req.getParameter("pName");
		Float price=Float.parseFloat(req.getParameter("price"));
		int qty=Integer.parseInt(req.getParameter("qty"));
		int id=new Random().nextInt(10909);
		
		//process - validation
		Product prod=new Product();
		prod.setProdId(id);
		prod.setProdName(name);
		prod.setPrice(price);
		prod.setQuantity(qty);
		pServ=new ProductService();
		String path=null;
		String msg=null;
		RequestDispatcher rd=null;
		try {
			int pid=pServ.addProduct(prod);
			path="result";
			rd=req.getRequestDispatcher(path);
			req.setAttribute("msg",pid+" successfully stored!!!");
			rd.forward(req, resp);
		//	System.out.println(pid!=0?"stored with id "+pid:"not stored");
		} catch (SQLException e) {
			path="result";
			msg="data not stored :: "+e.getMessage();
			rd=req.getRequestDispatcher(path);
			req.setAttribute("msg", msg);
			rd.forward(req, resp);
			//System.out.println("error "+e.getMessage());
		}
	}
}



