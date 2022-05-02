<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRAR Visitante</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body >
<center>
<h2>Registrar Visitante</h2>
<form:form action="RegistrarVisitante" modelAttribute="visitante">
<form:label path="Nombre">ingrese nombre</form:label>
<form:input path="Nombre"/>
<br/>
<form:label path="Apellido">ingrese PrimerApellido</form:label>
<form:input path="Apellido"/>
<br/>
<form:label path="SegApellido">ingrese SegundoApellido</form:label>
<form:input path="SegApellido"/>
<br/>
<form:label path="TipoDocumento">ingrese TipoDocumento</form:label>
<form:input path="TipoDocumento"/>
<br/>
<form:label path="nroDocumento">ingrese nroDocumento</form:label>
<form:input path="nroDocumento"/>
<br/>
<form:label path="Genero">ingrese Genero</form:label>
<form:input path="Genero"/>
<br/>
<form:label path="Estado">ingrese Estado</form:label>
<form:radiobutton path="Estado" value="Activo"/>Activo	
<form:radiobutton path="Estado" value="No Activo"/>No Activo
<br/><br>
<button type="submit" class="btn btn-success" value="RegistrarVisitante">Registrar Visitante</button>
</form:form>
<br>

<table class="table table-dark">
<tr>
<th>id visitante </th><th>nombre</th>
<th>apellido</th><th>segApellido</th>
<th>tipoDocumento</th><th>nroDocumento</th>
<th>genero</th><th>estado</th>
<th>acciones</th>
</tr>
<c:forEach items="${listadevisitante}" var="visitante">
<tr>
<td>${visitante.idVisitante}</td><td>${visitante.nombre}</td><td>${visitante.apellido}</td><td>${visitante.segApellido}</td>
<td>${visitante.tipoDocumento}</td><td>${visitante.nroDocumento}</td><td>${visitante.genero}</td><td>${visitante.estado}</td>
<td><a href="EliminarVisitante?cod=${visitante.idVisitante}" style="text-decoration: none;">Eliminar </a>|
<a href="EditarVisitante?cod=${visitante.idVisitante}" style="text-decoration: none;">Actualizar </a></td>
</c:forEach>
</table>

</center>
</body>
</html>