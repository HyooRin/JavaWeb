<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
</head>
<body>
 <h1>머묵을래 담아봐라</h1>
 <form action="cartProc.jsp">
  <input type="checkbox"id="fruit"name="fruits"value="체리">
  <label for="fruit">체리</label>
  <input type="checkbox"id="fruit"name="fruits"value="자몽">
  <label for="fruit">자몽</label>
  <input type="checkbox"id="fruit"name="fruits"value="메론">
  <label for="fruit">메론</label>
  <input type="checkbox"id="fruit"name="fruits"value="레몬">
  <label for="fruit">레몬</label>
  
  <input type="submit"value="담기">
  <input type="submit"value="삭제"name="delete">
 
 </form>

</body>
</html>