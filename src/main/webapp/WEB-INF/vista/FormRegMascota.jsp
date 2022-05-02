<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRAR Mascota</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body >
<center>
<h2>Registrar Mascota</h2>
<form:form action="RegistrarMascota" modelAttribute="mascota">
<form:label path="Nombre">ingrese nombre</form:label>
<form:input path="Nombre"/>
<br/>
<form:label path="Mascota">ingrese mascota</form:label>
<form:input path="Mascota"/>
<br/>
<form:label path="Raza">ingrese Raza</form:label>
<form:input path="Raza"/>
<br/><br>
<button type="submit" class="btn btn-success" value="RegistrarMascota">Registrar Mascota</button>
</form:form>
<br>

<table class="table table-dark">
<tr>
<th>id mascota </th><th>nombre</th>
<th>mascota</th><th>raza</th>
</tr>
<c:forEach items="${listademascota}" var="mascota">
<tr>
<td>${mascota.idMascota}</td><td>${mascota.nombre}</td><td>${mascota.mascota}</td>
<td>${mascota.raza}</td>
<td><a href="EliminarMascota?cod=${mascota.idMascota}" style="text-decoration: none;">Eliminar </a>|
<a href="EditarMascota?cod=${mascota.idMascota}" style="text-decoration: none;">Actualizar </a></td>
</c:forEach>
</table>

</center>
</body>
</html>