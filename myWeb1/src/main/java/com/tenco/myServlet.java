package com.tenco;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/ms")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		// http://localhost:8080/myWeb1/ms
//		System.out.println("안녕 MyServlet 객체가 동작했어!!");
		
		
		System.out.println("ContentType : " + request.getContentType());
		
		// 응답 response 객체를 사용하면된다.
//		response.setCharacterEncoding("UTF-8");
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(response.getOutputStream()));
//		bw.write("가나다라마바사");
//		bw.newLine();

		// 
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf8;");
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<body>");
		out.print("<section>");
		out.print("<p style = \"color:red\">");
		out.print("Hello, First Servlet");		
		out.print("</p>");
		out.print("</section>");
		out.print("</body>");
		out.print("</head>");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
