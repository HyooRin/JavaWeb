package com.HR.board.server;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.HR.board.dao.UserDAO;
import com.HR.board.dto.UserDTO;

@WebServlet("/user")
public class MyUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO dao = new UserDAO();
		String action = request.getParameter("action");
		
		//ArrayList<UserDTO> userList = dao.select();
		//request.setAttribute("list", userList);
		//RequestDispatcher dispatcher = request.getRequestDispatcher("");
		//dispatcher.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
