<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%


// form 태그로 넘어오는 값을 파싱하는 기술 
// form 태그의 MIME TYPE -> application/x-www-relencokde............
// name=""키값을 찾아내서 값을 긁어낼 수 있다
String inputId = request.getParameter("userId");
String inputPwd = request.getParameter("password");
String remember = request.getParameter("remember");

// 여기 파일의 목적은 remember 값 유무에 따라서 로직을 작성(쿠키사용)
if (remember != null) {
	// 쿠키생성 로직 
	Cookie cookie = new Cookie("userId", inputId);//쿠키 생성
	cookie.setMaxAge(60 * 60 * 24 * 30);//30일간 유지
	response.addCookie(cookie);
} else {
	// 쿠키삭제 로직 remember에 사용자가 하지않은 상태라면 쿠키를 삭제하기 
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie c : cookies) {
			if (c.getName().equals("userId")) {
				c.setMaxAge(0);
				response.addCookie(c);
				break;
			}
		}
	}

}

response.sendRedirect("login.jsp");
%>