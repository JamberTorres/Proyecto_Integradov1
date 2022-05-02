<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Propietario</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>
<h1>Editar Propietario</h1>
<!-- inicio del formulario editar...-->
<form:form action="RegistrarPropiertario" modelAttribute="propietario">
<form:hidden path="id"/>
<form:label path="Nombre">nombre</form:label>
<form:input path="Nombre"/>
<br>
<form:label path="PrimerApellido">primerApellido</form:label>
<form:input path="PrimerApellido"/>
<br>
<form:label path="SegundoApellido">segundoApellido</form:label>
<form:input path="SegundoApellido"/>
<br>
<form:label path="TipoDocumento">tipoDocumento</form:label>
<form:input path="TipoDocumento"/>
<br>
<form:label path="nroDocumento">nroDocumento</form:label>
<form:input path="nroDocumento"/>
<br>
<form:label path="Nacionalidad">nacionalidad</form:label>
<form:input path="Nacionalidad"/>
<br>
<form:label path="Estado">ingrese Estado</form:label>
<form:radiobutton path="Estado" value="Activo"/>Activo	
<form:radiobutton path="Estado" value="No Activo"/>No Activo
<br/>
<form:select path="departamento" id="departamento">
<form:option value="none" label="${propietario.departamento.descripcion}"  ></form:option>
        <form:options items="${departamento}"  
             itemValue="IDdepart"      itemLabel="Descripcion"/>
</form:select>
<br><br>

<button type="submit" class="btn btn-success" value="Actualizar">Actualizar Propietario</button>
<!-- fin del formulario editar... -->
</form:form></center>
</body>
</html>