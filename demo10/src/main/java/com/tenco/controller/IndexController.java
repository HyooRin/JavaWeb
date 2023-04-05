package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inc")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// http://localhost:8080/demo10/inc?name=홍길동&pw=123
		String username = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		System.out.println("username" + username);
		System.out.println("pw" + pw);
		
		// 1. 콘솔에 한글 안깨짐
		// 2. 응답시 한글 깨짐 (해결방법 "text/html; charset-UTF-8" 설정하기 )
//		response.setContentType("text/html; charset-UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print("username" + username);
//		out.print("<br>");
//		out.print("pw:" + pw);
		
		
		
		// index.jsp 
		
		// path : URI 개념 (URL)
		// docBase = 폴더경로 -> 루트경로 : webapp -> WEB-INF index.jsp
		
		// 보안상으로 바로 접근할 수 없어서 foward 방식으로 처리를 한다. 
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// post 방식
		// 1. 요청으로 들어온 값 콘솔창에 한글 깨짐 (해결방안 setCharacterEncoding("UTF-8") )
		// 2. 응답시 한글깨짐  (해결방안 setContentType("text/html; charset-UTF-8"))
		 //request.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("username");
		String pw = request.getParameter("pw");
		
		System.out.println("username :" + username);
		System.out.println("pw :" + pw);	
		
		// 응답 처리
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("사용자 이름 :" + username);
		out.print("<br>");
		out.print("비번 :" + pw);
		
		
		
	}

}
