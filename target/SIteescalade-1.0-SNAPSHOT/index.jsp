<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Test</title>
</head>
<body>
<h1>Hello world</h1>

<p><s:url action="adduser" var="addUser" /> <s:a href="%{addUser}">add user</s:a></p>
</body>
</html>