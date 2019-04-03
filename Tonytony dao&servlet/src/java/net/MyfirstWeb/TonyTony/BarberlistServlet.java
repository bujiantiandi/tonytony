/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author DELL
 */
public class BarberlistServlet extends HttpServlet {

	public BarberlistServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BarberDao barberDao = new BarberDao();
		List<barber> list = barberDao.getAll();
		String jsonString = GsonUtil.getGson().toJson(list);
		response.setContentType("text/html");
		System.out.println("*(****");
		PrintWriter out = response.getWriter();
		out.println(jsonString);
		out.flush();
		out.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
