<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--여기 jsp 파일을 에러 전용 페이지로 사용할려면  -->
<!--반드시 isErrorPage = true를 선언해줘야한다 -->

<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String imgDir;
imgDir = application.getInitParameter("imgDir");
%>

 <h2>잘못된 요청</h2>
 <div>
 <img alt="에러이미지" src="/demo6<%=imgDir %>/realError.png">
 </div>
 
 

</body>
</html>