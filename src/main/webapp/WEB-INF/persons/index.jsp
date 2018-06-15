<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Persons Information</title>
</head>
<body>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>  
<h1>Information</h1>
<table>
<thead>
<tr>
<td><strong>First Name</strong></td>
<td><strong>Last Name</strong></td>
<td><strong>License#</strong></td>
<td><strong>State</strong></td>
<td><strong>Expiration Date</strong></td>
</tr>
</thead>
<tbody>
<p:forEach items="${persons}" var="person">


<tr>
<td><a href="/persons/${person.id}"><p:out value="${person.firstName}"/></a></td>
<td><p:out value="${person.lastName}"/></td>
<td><p:out value="${person.license.number}"/></td>
<td><p:out value="${person.license.state}"/></td>
<td><p:out value="${person.license.expiration_date}"/></td>
</tr>


</p:forEach>

</tbody>
</table>
<a href="licenses/new">New License</a>
</body>
</html>