<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar  departamento....</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body >
<center>
<h1>Registrar | Departamento</h1>
<!-- elegimos la opcion form-form del formulario mvc tags.... -->
<form:form action="registrarDepartamento" modelAttribute="tpdepartamento">
<table >
<tr>
<td><form:label path="descripcion">ingrese descripcion</form:label></td>
<td><form:input path="descripcion"/></td>
</tr>
<td>
<button type="submit" class="btn btn-success" value="Registrar departamento" name="registrarDepartamento">Registrar Departamento</button>
</td>
</table>
</form:form>
<!-- mostramos listados de departamento  -->
<table class="table-dark">
<tr>
<th>codigo |</th>
<th>Tipo departamento</th></tr>
<br>
<c:forEach items= "${listadodepartamento}"  var="tpdepartamento">
<tr>
<td>  ${tpdepartamento.IDdepart} </td>
<td> ${tpdepartamento.descripcion}  </td>
</tr>
</c:forEach>
</table></center>
</body>
</html>