package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userController
 */
@WebServlet("/usercontroller")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public userController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 문제 2
		// JSON 형식으로 name = 홍길동, age=10이라는 값을 리턴시키세요
		PrintWriter out = response.getWriter();
		response.setContentType("application/json; charset=utf-8;");
		out.print("{\n");
		out.print("\"name\":\"홍길동\"");
		out.print("\"age\":23");
		out.print("\n}");
		
		
	}

	// Method : post
	// http://localhost:8080/blog/userController
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form 태그에서 넘어오는 값들을 받아보고 ??연산을 해서 응답처리해보기 
		// 요청시 파라미터로 넘겨온 키값을 확인해서 값을 추출하는 기술을 알아보자
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		
		System.out.println("name :" + name);
		System.out.println("pwd :" + pwd);
		
		// 응답 처리
		// 문제 1
		// MIME TYPE text/html 방식 -> 이름과 비번을 확인하였습니다.
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html; charset=utf-8;");
		writer.print("<!DOCTYPE html>");
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("이름과 비번을 확인하였습니다");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</head>");
		

		
		
	}

}
