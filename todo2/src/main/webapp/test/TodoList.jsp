<%@ page import= "com.tenco.todo.dto.TodoDTO" %>
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
 <h2>TodoList</h2>
  <table>
   <tr>
    <th>ID</th>
    <th>TITLE</th>
    <th>DESCRIPTION</th>
    <th>PRIORITY</th>
    <th>COMPLETED</th>
    <th>CREATE AT</th>
   </tr>
     <c:forEach var="todo" items="${list}">
   <tr>
    <td>${todo.id}</td>
    <td>${todo.title}</td>
    <td>${todo.description}</td>
    <td>${todo.priority}</td>
    <td>${todo.completed}</td>
    <td>${todo.createdAt}<button><a href="/todo2/todoTest?action=delete&cid=${todo.id}">delete</a></button></td>
   </tr>
  
  </c:forEach>
  </table>

</body>
</html>