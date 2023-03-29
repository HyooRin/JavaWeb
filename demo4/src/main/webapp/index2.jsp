<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Practice</title>
</head>
<body>
 <form action="login2.jsp"method="post">
  <label>ID</label>
  <input type="text"id="id"name="id">
  <label>password</label>
  <input type="password"id="password"name="password">
  <input type="submit"value="로그인">
 
 </form>
 
 <%
 
  if(session.getAttribute("id") != null){%>
  
  	<p>현재 로그인 상태입니다. 사용자이름 : <%= session.getAttribute("id") %></p>
  	
	  
	  
  <% } %>
 
 
 
 

</body>
</html>