<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp" />
<style>
main {
	heigth: 300px;
	display: flex;
	flex-direction: column;
	justify-content: flex-start;
	align-items: flex-start;
	padding: 20px;
}
h1{
	margin-top: 30px;
	margin-bottom: 10px;
	font-size: 20px;
	font-weight: bold;
	text-align: center;
}
a{
 text-decoration: none;
 color: lime;
}
</style>

<main>
	<h1>덧셈 게임</h1>
	
	<%
	 if(request.getParameter("answer") != null){
		 
		 int answer = Integer.parseInt(request.getParameter("answer"));
		 int guess = Integer.parseInt(request.getParameter("guess"));
		 
		 if(answer == guess){			 
			 out.println("<p>축하합니다 정답</p>");
		 }else{
			 out.println("<p>아쉽지만 틀림 다시 도전해</p>");
			 
		 }
		 
	 }
	%>
	<br>
	<div>
	 <a href="/demo3/tag5.jsp">문제 다시 풀래?</a>
	</div>


	


</main>


<jsp:include page="/layout/footer.jsp" />