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
import com.google.gson.Gson;



/**
 *
 * @author DELL
 */
public class BarberFindServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    public BarberFindServlet() {
	super();
    }

    public void destroy() {
	super.destroy(); // Just puts "destroy" string in log
		// Put your code here
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

        BarberDao barberdao = new BarberDao();
        String barbername = request.getParameter("barbername");
        request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	List <barber> list = barberdao.getBarberByName(barbername);
	String json = GsonUtil.getGson().toJson(list);
	out.print(json);
		
	out.flush();
	out.close();
    }

    public void init() throws ServletException {
		// Put your code here
	}

}


