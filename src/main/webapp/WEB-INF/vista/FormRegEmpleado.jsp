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
<form:form action="RegistrarEmpleado" modelAttribute="empleado">
<form:label path="Nom">ingrese nombre</form:label>
<form:input path="Nom"/>
<br/>
<form:label path="Apell">ingrese apellido</form:label>
<form:input path="Apell"/>
<br/>
<form:label path="Cell"> celular/telefono</form:label>
<form:input path="Cell"/>
<br/>
<form:label path="Dni">ingrese dni</form:label>
<form:input path="Dni"/>
<br/>
<form:label path="SEX">seleccione sexo</form:label>
<form:radiobutton path="SEX" value="M"/>masculino
<form:radiobutton path="SEX" value="F"/>femenino
<br/>
<form:select path="departamento" id="departamento">
<form:option value="none" label="seleccione departamento"  ></form:option>
        <form:options items="${departamento}" itemValue="IDdepart"  itemLabel="Descripcion"/>
</form:select>
<br/><br>

<button type="submit" class="btn btn-success" value="RegistrarEmpleado">Registrar Propietario</button>
</form:form>
<br>

<table class="table table-dark">
<tr>
<th>id empleado </th><th>nombre</th>
<th>apellido</th><th>celular</th>
<th>dni</th><th>sexo</th>
<th>departamento</th><th>acciones</th>
</tr>
<c:forEach items="${listadeempleado}" var="empleado">
<tr>
<td>${empleado.id}</td><td>${empleado.nom}</td><td>${empleado.apell}</td><td>${empleado.cell}</td>
<td>${empleado.dni}</td><td>${empleado.SEX}</td><td>${empleado.departamento.descripcion}</td>
<td><a href="EliminarEmpleado?cod=${empleado.id}" style="text-decoration: none;">Eliminar </a>|
<a href="EditarEmpleado?cod=${empleado.id}" style="text-decoration: none;">Actualizar </a></td>
</c:forEach>
</table>


</center>
</body>
</html>