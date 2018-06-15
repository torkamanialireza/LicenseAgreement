<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Persons with license</title>
</head>
<body>
<h1>Licenses</h1>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%> 
<p:forEach items="${persons}" var="person">
<p:out value="${person.firstName}"/>
<p:out value="${person.firstName}"/>

</p:forEach>
</body>
</html>