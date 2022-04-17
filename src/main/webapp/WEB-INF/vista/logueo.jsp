<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">   
<html>    
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
    <title>Login Form</title>    
    <link rel="stylesheet" type="text/css" href="./estilo.css">    
    <style>
    body  {  
    margin: 0;  
    padding: 0;  
    background-color:#6abadeba;  
    font-family: 'Arial';  
}  
.login{  
        width: 382px;  
        overflow: hidden;  
        margin: auto;  
        margin: 20 0 0 450px;  
        padding: 80px;  
        background: #23463f;  
        border-radius: 15px ;        
}  
h2{  
    text-align: center;  
    color: #277582;  
    padding: 20px;  
}  
label{  
    color: #08ffd1;  
    font-size: 17px;  
}  
#Uname{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
}  
#Pass{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
      
}  
#log{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 17px;  
    padding-left: 7px;  
    background-color: yellow;  
}  
span{  
    color: white;  
    font-size: 17px;  
}  
a{  
    float: right;  
    background-color: grey;  
}  
    </style>
</head>    
<body bgcolor=" #6abadeba;  ">    
    <center><h2>Login Page</h2><br>    
    <div class="login">    
    <form id="login" method="post" action="validar">    
        <label><b>User Name  </b>    
        </label>    
        <input type="text" name="usuario" id="Uname"  placeholder="Username">    
        <br>  
        <label><b>Password </b>
        </label>    
        <input type="password" name="password" id="Pass" placeholder="*******">    
        <br><br>    
        <input type="submit" name="enviar" id="log" value="Log In Here">       
        <br><br>    
        ${error}
        </form>     
</div>    
</center>
</body>    
</html>    