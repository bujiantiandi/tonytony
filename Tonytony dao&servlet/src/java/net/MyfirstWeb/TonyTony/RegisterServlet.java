/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 * 注册功能
 */


public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
        doGet(request, response);
 
        //设置客户端的解码方式为utf-8
        response.setContentType("text/html;charset=utf-8");
        //
        response.setCharacterEncoding("UTF-8");
 
        PrintWriter out = response.getWriter();
	UserDAO userDao = new UserDAO();
	String accountNumber = (String) request.getParameter("accountNumber");
	String password = (String) request.getParameter("password");
	String phonenumber = (String) request.getParameter("phonenumber");
	User user = userDao.loginCheck(accountNumber);
	if (user != null){
            out.println("fail");
	}
	else {
		user = new User();
		user.setUserName(accountNumber);
		user.setPassword(password);
		user.setphoneNumber(phonenumber);
		if (UserDAO.insertUser(user)){
			out.println("insert success");
		}
		else {
			out.println("insert failed");
		}
	}

	out.flush();
	out.close();
    }

	public void init() throws ServletException {
		// Put your code here
	}
}

