package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.repository.TodoDAO;

@WebServlet("/todoTest")
public class TodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodoTest() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TodoDAO dao = new TodoDAO();
		String action = request.getParameter("action");
		if("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
			
		}else {
			
			ArrayList<TodoDTO> resultList = dao.select();
			// request,response -> TodoList.jsp
			request.setAttribute("list", resultList); // request 객체에 값 셋팅
			RequestDispatcher dispatcher = request.getRequestDispatcher("test/TodoList.jsp");
			dispatcher.forward(request, response);
		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String priority = request.getParameter("priority");
		String completed = request.getParameter("completed");
		String categoryId = request.getParameter("categoryId");

		int responseCount = 0;

		TodoDAO dao = new TodoDAO();
		String action = request.getParameter("action");

		if (action.equals("insert")) {

			TodoDTO dto = new TodoDTO();
			dto.setTitle(title);
			dto.setDescription(description);
			dto.setPriority(Integer.parseInt(priority));
			dto.setCompleted(Integer.parseInt(completed));
			dto.setCategoryId(Integer.parseInt(categoryId));

			responseCount = dao.insert(dto);

		}else if(action.equals("update")){
			
			responseCount = dao.update(description, title);			
		}
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("적용된 갯수는? :" + responseCount);

	}

}
