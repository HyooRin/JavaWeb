<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo update</title>
</head>
<body>
 <h1>Todo Update Form </h1>
  
  <form action="/todo2/todoTest?action=update" method="post">
   <label for="title">제목 :</label>
   <input type="text" name="title" required="required">
   <label for="description">바꿀 내용 :</label>
   <input type="text" name="description" required="required">
   <input type="submit" value="수정">
  
  </form>

</body>
</html>