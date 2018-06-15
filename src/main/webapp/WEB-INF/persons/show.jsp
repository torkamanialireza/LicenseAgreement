<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Person Page Details</title>
</head>
<body>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%> 
<h1><p:out value="${person.firstName}"/> <p:out value="${person.lastName}"/></h1>
<p>License Number : <p:out value="${person.license.number}"/> </p>
<p>State : <p:out value="${person.license.state}"/> </p>
<p>Expiration Date : <p:out value="${person.license.expiration_date}"/> </p>

<a href="/persons">back</a>

</body>
</html>