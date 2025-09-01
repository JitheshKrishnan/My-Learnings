<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<c:forEach items="${students}" var="s" >
		${s.rollNo} <br>
	</c:forEach>
	
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/aliens" user="root" password="***"/>
	<sql:query var="rs" dataSource="${db}">SELECT * FROM Student</sql:query>
	<c:forEach items="${rs.rows}" var="s">
		<br><c:out value="${s.userId}"></c:out>: <c:out value="${s.userName}"></c:out>
	</c:forEach>
	<c:set var="str" value="Jithesh is a Java Developer"/>
	<br> ${str}
	<br>
	Length: ${fn:length(str)}
	<c:forEach var="s" items="${fn:split(str,'a')}" >
		<br>
		${s}
	</c:forEach>
	<br>
	<c:if test="${fn:contains(str,'Java')}">
		Java is there!
	</c:if>
	
</body>
</html>