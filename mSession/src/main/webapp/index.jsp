<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
 // 세선을 꺼내는 방법 확인
 String username = (String)session.getAttribute("username");
 if(username == null){
	 response.sendRedirect("login.jsp");
 }

%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

input[type="submit"]{
 background-color: #F7CCC8;
 border-radius: 5px;
 border: 1px solid #eee;
 width: 100px;
 height: 25px;S 

}

</style>
</head>
<body>
 <h1>Welcome, <%=username %>!</h1>
 <form action="logout.jsp">
  <input type="submit"value="logout">
 </form>

</body>
</html>