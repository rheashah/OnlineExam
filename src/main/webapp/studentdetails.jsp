<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen" href="./assets/css/main.css" />
<title>Records</title>
</head>
<body>
<div class="topnav">
		<a class="active" href="admin.jsp">Home</a> <a href="about_us.jsp">About
			Us</a> <a style="float: right" href="login.jsp">Logout</a>
	</div>
<table border="1">
		<thead>
			<tr>
			
				<th>Exam ID</th>                                                                                                                                
				<th>Subject Name</th>
				<th> Level</th>
				
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="exam" items="${exams}">
			
				<form action="viewReportBySubjectNameAndEmail.lti" method="post">
				<tr>
				
				<td><input type="hidden" name="examId" value="${exam.examId}">${exam.examId}</input></td>
				<td name="subjectName">${exam.subject.subjectName}</td>
				<td name="currentLevel">${exam.currentLevel }</td>
				<td><input type="submit" value="View Report"></td>
				</tr>
				</form>
			
			</c:forEach>
		</tbody>
	</table>
</body>
</html>