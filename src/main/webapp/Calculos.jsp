<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h>Planilla de trabajadores</h>
<br>
<%!
public int calcular(int x,int y){
	int resul=x*y;
	return resul;
}
/*
int vh = Integer.parseInt(request.getParameter("vh")); 
int ch= Integer.parseInt(request.getParameter("ch")); 
int tp=vh*ch;
out.println("<b>total a pagar</b> "+tp+" S/");
*/
%>
<%

int vh = Integer.parseInt(request.getParameter("vh")); 
int ch= Integer.parseInt(request.getParameter("ch")); 
//int tp=vh*ch;
out.println("<b>total a pagar a trabajador</b> "+calcular(vh,ch)+" S/");
%>

</body>
</html>