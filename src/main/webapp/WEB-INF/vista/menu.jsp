<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema Web </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body bgcolor="#c5dec9">
<center><h1>Bienvenido al sistema web ......</h1>
<h2>
${mensaje}
<br>
<br>


<nav class="navbar navbar-light bg-info">
  <a class="navbar-brand" href="conttdepartamento/registrarDepartamento">Registrar departamento</a>
  <a class="navbar-brand" href="conttusuario/registrarUsuario" style="text-decoration: none;">Registrar Usuario</a>
   <a class="navbar-brand" href="conRegistrarPropietario/RegistrarPropiertario" style="text-decoration: none;">Registrar  Propietario</a>
</nav>

</h2>
</center>
</body>
</html>