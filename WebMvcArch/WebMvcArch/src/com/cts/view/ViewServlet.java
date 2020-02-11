package com.cts.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class ViewServlet extends HttpServlet {
PrintWriter out=null;
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String msg=(String)req.getAttribute("msg");
	out=resp.getWriter();
	out.println("<html><head><title>my page</title></head>");
	out.println("<body>");
	out.println("<h1>"+msg+"</h1>");
	out.println("</body>");
	out.println("</html>");
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}