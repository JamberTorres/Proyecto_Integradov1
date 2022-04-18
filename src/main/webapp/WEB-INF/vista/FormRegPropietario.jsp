<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRAR Propietario</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body >
<center>
<h2>Registrar Propietario</h2>
<form:form action="RegistrarPropiertario" modelAttribute="propietario">
<form:label path="Nombre">ingrese nombre</form:label>
<form:input path="Nombre"/>
<br/>
<form:label path="PrimerApellido">ingrese PrimerApellido</form:label>
<form:input path="PrimerApellido"/>
<br/>
<form:label path="SegundoApellido">ingrese SegundoApellido</form:label>
<form:input path="SegundoApellido"/>
<br/>
<form:label path="TipoDocumento">ingrese TipoDocumento</form:label>
<form:input path="TipoDocumento"/>
<br/>
<form:label path="nroDocumento">ingrese nroDocumento</form:label>
<form:input path="nroDocumento"/>
<br/>
<form:label path="Nacionalidad">ingrese Nacionalidad</form:label>
<form:input path="Nacionalidad"/>
<br/>
<form:label path="Estado">ingrese Estado</form:label>
<form:input path="Estado"/>
<br/>
<form:select path="departamento" id="departamento">
<form:option value="none" label="seleccione departamento"  ></form:option>
        <form:options items="${departamento}" itemValue="IDdepart"  itemLabel="Descripcion"/>
</form:select>
<br/><br>

<button type="submit" class="btn btn-success" value="RegistrarPropiertario">Registrar Propietario</button>
</form:form>
<br>

<table class="table table-dark">
<tr>
<th>id propietario </th><th>nombre</th>
<th>primerApellido</th><th>segundoApellido</th>
<th>tipoDocumento</th><th>nroDocumento</th>
<th>nacionalidad</th><th>estado</th>
<th>departamento</th><th>acciones</th>
</tr>
<c:forEach items="${listadepropietario}" var="propietario">
<tr>
<td>${propietario.id}</td><td>${propietario.nombre}</td><td>${propietario.primerApellido}</td><td>${propietario.segundoApellido}</td>
<td>${propietario.tipoDocumento}</td><td>${propietario.nroDocumento}</td><td>${propietario.nacionalidad}</td><td>${propietario.estado}</td>
<td>${propietario.departamento.descripcion}</td>
<td><a href="EliminarPropietario?cod=${propietario.id}" style="text-decoration: none;">Eliminar </a>|
<a href="EditarPropietario?cod=${propietario.id}" style="text-decoration: none;">Actualizar </a></td>
</c:forEach>
</table>

</center>
</body>
</html>