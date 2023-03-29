<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

  String[] fruits = request.getParameterValues("fruits");

  // 방어적코드
  if(fruits != null && fruits.length > 0){
	  //사용자가 체크박스를 하나이상 선택한 경우
	  //for(String fruit : fruits){
		  //String countParam = fruit + ":count";
		  //out.println(fruit);
	  //}	  
	  
	  
	  Cookie[] cookies = new Cookie[fruits.length];
	  for(int i=0;i<fruits.length;i++){
		  cookies[i] = new Cookie("fruits",fruits[i]);		  
	      cookies[i].setMaxAge(60);
	      response.addCookie(cookies[i]);
	      out.println(cookies[i].getValue());
	  }
	  
	  
	  
  }else{
	  
	  Cookie[] cookies = request.getCookies();
	  if(cookies != null){
		  
		  for(Cookie c : cookies){
			  
			  if(c.getName().equals("fruits")){
				  c.setMaxAge(0);
				  response.addCookie(c);
				  break;
			  }
			  
		  }
	  }
  }
  
  //String isDelete = request.getParameter("delete");
  
  //if(isDelete != null){
	  //if(isDelete.equals("delete")){
		  // 삭제처리
	  //}
  //}
  
  //out.print(isDelete);
  
  
  


%> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>