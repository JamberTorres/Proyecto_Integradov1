<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar  Usuario....</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body bgcolor="#c5dec9">
<center>
<h1>Registrar  Usuario</h1>
<!-- elegimos la opcion form-form del formulario mvc tags.... -->
<form:form action="registrarUsuario" modelAttribute="tpusuario">
<table >
<tr>
<td><form:label path="nombre">ingrese nombre</form:label></td>
<td><form:input path="nombre"/></td>
</tr>
<tr>
<td><form:label path="descripcion">ingrese descripcion</form:label></td>
<td><form:input path="descripcion"/></td>
</tr>
<tr>
<td>
<button type="submit" class="btn btn-success" value="Registrar Empleado" name="registrarUsuario">Registrar Usuario</button>
</td>
</tr>
</table>
<br><br>
</form:form>
<!-- mostramos listados de usuario -->
<table  class="table table-dark">
<tr border="2"><th>codigo</th><th>Tipo usuario</th></tr>
<c:forEach items="${listadousuario}" var="tpusuario">
<tr>
<td> ${tpusuario.nombre} </td>
<td> ${tpusuario.descripcion} </td>
</tr>
</c:forEach>

</table>
</center>
</body>
</html>