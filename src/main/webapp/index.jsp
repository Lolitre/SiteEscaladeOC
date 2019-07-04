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
<s:form action="inscription">
    <s:textfield name="user.nom" label="Nom" requiredLabel="true"/>
    <s:textfield name="user.email" label="Email" requiredLabel="true"/>
    <s:password name="user.motdepasse" label="Mot de passe" requiredLabel="true"/>
    <s:password name="confirmation" label="Confirmer le mot de passe" requiredLabel="true"/>
    <s:submit value="OK"/>
</s:form>

<h2><s:property value="message" /></h2>

<p><s:url action="adduser" var="addUser" /> <s:a href="%{addUser}">add user</s:a></p>

</body>
</html>