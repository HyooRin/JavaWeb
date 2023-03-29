<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo List 저장하기</title>
</head>
<body>
 <h1>Todo List Form</h1>
 
  <form action="/todo2/todoTest?action=insert" method="post">
  <label for="title">할일 :</label>
  <input type="text" name="title" required="required">
  <label for="description">설명 :</label>
  <input type="text" name="description" required="required">
  <label for="priority">우선순위 :</label>
  <input type="number" name="" required="required">  
  <label for="completed">완료 :</label>
  <input type="number" name="completed" required="required">
  <label for="categoryId">카테고리ID :</label>
  <input type="number" name="categoryId" required="required">
  <input type="submit" value="TodoList 저장">
 </form>
 

</body>
</html>