<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp"/>
<style>

 main{

  display: flex;
  padding: 20px;
  flex-direction: column;
  align-items: center;
  justify-content: flex-start;

 }
 main pre{
 width: 100%;
 border: 1px solid black;
 padding: 20px;
 
 }
 
</style>

<main>
<pre>
 <% %> <-- 스크립트 릿(scriptlet, HTML 랜더링 후 태그는 보이지 않습니다.)
 <%="" %> <-- 표현식(expression, HTML 랜더링 후 태그는 보이지 않습니다.)
 <%--여기는 확인할 수 없어요 --%> <-- jsp주석(HTML 랜더링 후 태그는 보이지 않습니다.)
 <!--여기는 HTML 주석입니다. 소스보기로 확인가능합니다  -->
 ---------------------------------------------------
 스크입트 릿은 HTML과 Java코드를 혼합하여 사용할 수 있습니다.
 <% new java.util.Date(); %> <-- 부분은 출력은 안됨 
 화면에 데이터를 출력하려면 표현식을 사용해야한다.
 <%= new java.util.Date() %> 
 ------------------------------------
 
 사용방법
 스크립트 밋 : <% %> JSP 페이지에 코드를 실행할 수 있습니다.
 표현식 : <%="" %> JSP 페이지에서 Java코드와 결과 값을 출력 수 있습니다.
 
 자바 코드 위치 
 스크립트 릿:JSP 페이지 어디든지 위치할 수 있습니다.
 표현식 : HTML 태그 내부에서만 사용할 수 있습니다. 
 
 출력결과 
 스크립트 릿: 출력 결과를 지정하지않으면 아무런 출력이 되지않습니다.
 표현식 : 자바 결과값을 출력합니다.
 </pre>

</main>


<jsp:include page="/layout/footer.jsp"/>