<%@page import="com.tenco.todo.dto.CategoryDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>Category List</h2>
 <table>
  <tr>
   <th>ID</th>
   <th>Name</th>
  </tr>
  <%--jstl 임포트해서 안해도 됨 request.getAttribute("list");--%>
  <c:forEach var="category" items="${list}">
   <tr>
    <td>${category.id}</td>
    <td>${category.name}<button><a href="/todo/cTest?action=delete&cid=${category.id}">delete</a></button></td>
   </tr>
  
  </c:forEach>

  
 </table>

</body>
</html>