<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Mascota</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>
<h1>Editar Mascota</h1>
<!-- inicio del formulario editar...-->
<form:form action="RegistrarMascota" modelAttribute="mascota">
<form:hidden path="idMascota"/>
<form:label path="Nombre">ingrese nombre</form:label>
<form:input path="Nombre"/>
<br/>
<form:label path="Mascota">ingrese mascota</form:label>
<form:input path="Mascota"/>
<br/>
<form:label path="Raza">ingrese raza</form:label>
<form:input path="Raza"/>
<br><br>

<button type="submit" class="btn btn-success" value="Actualizar">Actualizar Mascota</button>
<!-- fin del formulario editar... -->
</form:form></center>
</body>
</html>