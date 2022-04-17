<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar empleado</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>
<h1>Editar empleado</h1>
<!-- inicio del formulario editar...-->
<form:form action="RegistrarEmpleado" modelAttribute="empleado">
<form:hidden path="id"/>
<form:label path="Nom">nombre</form:label>
<form:input path="Nom"/>
<br>
<form:label path="Apell">apellido</form:label>
<form:input path="Apell"/>

<br>
<form:label path="Cell">celular</form:label>
<form:input path="Cell"/>
<br>
<form:label path="SEX">seleccion sexo</form:label>
<form:radiobutton path="SEX" value="M"/>masculino
<form:radiobutton path="SEX" value="F"/>femenino
<br>
<form:select path="departamento" id="departamento">
<form:option value="none" label="${empleado.departamento.descripcion}"  ></form:option>
        <form:options items="${departamento}"  
             itemValue="IDdepart"      itemLabel="Descripcion"/>
</form:select>
<br><br>

<button type="submit" class="btn btn-success" value="Actualizar">Actualizar Empleado</button>
<!-- fin del formulario editar... -->
</form:form></center>
</body>
</html>