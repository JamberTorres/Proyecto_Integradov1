<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Departamento</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>
<h1>Editar Departamento</h1>
<!-- inicio del formulario editar...-->
<form:form action="registrarDepartamento" modelAttribute="tpdepartamento">
<form:hidden path="IDdepart"/>
<form:label path="Nombre">ingrese nombre</form:label>
<form:input path="Nombre"/>
<br/>
<form:label path="Descripcion">ingrese Descripcion</form:label>
<form:input path="Descripcion"/>
<br>
<form:label path="Piso"> numero Piso</form:label>
<form:input path="Piso"/>
<br>
<form:label path="MetroCuadrados">ingrre los MetroCuadrados</form:label>
<form:input path="MetroCuadrados"/>
<br>
<form:label path="Domitorios">ingrese los Domitorios</form:label>
<form:input path="Domitorios"/>
<br>
<form:label path="Baños">ingre los numeros de Baños</form:label>
<form:input path="Baños"/>
<br>
<form:label path="Años">ingre Años</form:label>
<form:input path="Años"/>
<br><br>

<button type="submit" class="btn btn-success" value="Actualizar">Actualizar Departamento</button>
<!-- fin del formulario editar... -->
</form:form></center>
</body>
</html>