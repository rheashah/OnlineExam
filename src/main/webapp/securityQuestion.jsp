<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>password</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="./assets/css/main.css"/>
    <script src="./assets/js/main.js"></script>
</head>
<body>
    <div class="form">
        <form action="validateUser.lti" method="post">
            <label>${user.securityQuestion}</label><br>
            <br>
            Answer : <input type="text" name="answer"/>
            <br>
            <br>
            <button type="submit">Check</button>
        </form>
    </div>
</body>
</html>