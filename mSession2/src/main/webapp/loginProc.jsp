<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
// 넘겨받은 값 username과 password를 확인해서
// admin1과 1234 값이 같다면 로그인 처리하는 코드를 작성하시오
// 아이디와 비번이 틀리다면 login.jsp 페이지로 이동하는 코드도 작성하시오

String userId = request.getParameter("userId");
String password = request.getParameter("password");

if (userId != null && password != null) {

	if (userId.equals("admin1") && password.equals("1234")) {

		session.setAttribute("userId", userId);

		response.sendRedirect("index.jsp");

	} else {

		response.sendRedirect("login.jsp");
	}
}
%>