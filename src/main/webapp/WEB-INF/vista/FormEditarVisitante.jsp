<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Visitante</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>
<h1>Editar Visitante</h1>
<!-- inicio del formulario editar...-->
<form:form action="RegistrarVisitante" modelAttribute="visitante">
<form:hidden path="idVisitante"/>
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
<form:input path="Estado"/>
<br/>
<form:select path="propietario" id="propietario">
<form:option value="none" label="${visitante.propietario.nombre}"  ></form:option>
        <form:options items="${propietario}"  
             itemValue="id"      itemLabel="nombre"/>
</form:select>
<br><br>

<button type="submit" class="btn btn-success" value="Actualizar">Actualizar Visitante</button>
<!-- fin del formulario editar... -->
</form:form></center>
</body>
</html>