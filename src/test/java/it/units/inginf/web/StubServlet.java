package it.units.inginf.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletCallback callback;
	public StubServlet(ServletCallback callback){
		this.callback = callback;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		callback.process(writer);
	}
}
