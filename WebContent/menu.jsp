<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Web Principal</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" type="text/css" href="CSS/estilos.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
	integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
	integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
	crossorigin="anonymous"></script>
</head>
<body>
	<center>

		<h1>
			<img src="IMG/shopping-cart-2020929_640.png" alt="Logo" class="logo">
			Ciber-Mercado
		</h1>

		<h2>Bienvenido a la página principal</h2>

		<form name=formPrincipal action=SrvBuscarProductos method=post>
			<label>Producto:</label><input type="text" name=producto><br>
			<label>Precio menor de:</label><input type="text" name=precio><br>
			<!-- Sección -->
			<label>Categoria:</label><select name="categoria">
				<option value="0" selected="selected">Todas</option>
				<option value="1">Charcuteria</option>
				<option value="2">Fruteria</option>
				<option value="3">Pescaderia</option>
				<option value="4">Otros</option>
			</select>
			<br>
			<button type="button" class="btn btn-outline-info botones"
				onclick="submit()">Buscar Productos</button>
		</form>

	</center>

</body>
</html>