<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Start Exam</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="./assets/css/main.css" />
<script src="./assets/js/main.js"></script>
</head>
<body>

<div class="topnav">
		<a class="active" href="admin.jsp">Home</a> <a href="about_us.jsp">About
			Us</a> <a style="float: right" href="login.jsp">Logout</a>
	</div>
<form method="POST" action="addQuestion.lti" enctype="multipart/form-data">

<h3>Upload File</h3>
    <div><input type="file" name="file"/></div>
   <div> <input type="submit" value="Submit" /></div>
    
    
</form>


</body>
</html>