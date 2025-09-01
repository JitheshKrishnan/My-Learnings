<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Welcome to Spring Boot MVC
		<br>
		<hr>
		<form action="addAlien" method="post">
			Enter id: <input type="text" name="aid"></input><br>
			<br>
			Enter name: <input type="text" name="aname"></input><br>
			<input type="submit"><br>
		</form><br>
		<hr>
		<form action="getAlien" method="get">
			Enter your id: <input type="text" name="aid"></input><br>
						<input type="submit"></input><br>
		</form><br>
		<hr>
		<form action="getAlienByName" method="get">
					Enter your name: <input type="text" name="aname"></input><br>
								<input type="submit"></input>
				</form>
	</body>
</html>