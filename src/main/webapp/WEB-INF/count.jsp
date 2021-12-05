<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>counter</title>
</head>
<body>
	<h1>You have visited this site: <c.out value"${count1.getCount()}"></c.out> </h1>
</body>
</html>