<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web Login</title>
<link rel="stylesheet" type="text/css" href="CSS/estilos.css">
</head>
<body>

	<center>

		<h1>Ciber-Mercado</h1>

		<h2>Bienvenido a la página de login.Por favor introduce tus datos</h2>

		<form name=formLogin action=SrvLogin method=post>
		<label>Usuario</label><br> <input type=text name=user><br>
		<label>Password</label><br> <input type=text name=password><br></label>
		<input type=submit value=Acceder></form>
		
		<p>Si no estas registrado <a href="formularioRegistro.jsp">pincha aqui</a></p>

	</center>

</body>
</html>