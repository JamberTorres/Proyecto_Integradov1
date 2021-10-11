<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
<%=new java.util.Date() %>
<h2>Gestionando proyectos con  Maven.......</h2>

<h2>Calculo de trabajador por hora</h2>
<form action="Calculos.jsp" method="post">
Valor de Hora:<input type="text" name="vh">
<br>
Cantidad de Horas:<input type="text" name="ch">
<br>
<input type="submit" value="Calcular">
</form>



</body>
</html>
