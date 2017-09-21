<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Web Login</title>
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

<script language=JavaScript>
<!--
	$(document)
			.ready(
					function() {
						$(".test")
								.click(
										function() {
											alert("Política de empresa: Se garantiza la seguridad de los datos del cliente en base a la Ley de Protección de Datos");
										});

						$('.carousel').carousel({
							interval : 3000
						});
						$(".btn-secondary").click(function(){ 
							$("formLogin .desaparece").fadeOut(1000);
						});
						$("h1 div .btn-secondary").click(function(){
							$("form label .desaparece").value("User");
						});
					});

	-->
</script>
</head>
<body>

	<%
		String user = (String) session.getAttribute("user");
		String password = (String) session.getAttribute("password");
	%>

	<center>

		<h1>
			<img src="IMG/shopping-cart-2020929_640.png" alt="Logo" class="logo">
			<p class="rotulo">Ciber-Mercado</p>
			<div class="btn-group right-place" role="group" aria-label="Basic example">
				<button type="button" class="btn btn-secondary">ES</button>
				<button type="button" class="btn btn-secondary">EN</button>
			</div>
		</h1>

		<h2>Bienvenido a la página de login.Por favor introduce tus datos</h2>

		<form name=formLogin action=SrvLogin method=post>
			<label class="desaparece">Usuario</label><br> <input type=text name=user
				placeholder="Jose" class="centrado"><br> <label>Password</label><br>
			<input type=text name=password placeholder="1234" class="centrado"><br>

			<button type="button" class="btn btn-outline-info botones"
				onclick="submit()">Acceder</button>
		</form>

		<p>
			Si no estas registrado <a href="formularioRegistro.jsp">pincha
				aqui</a>
		</p>

		<input type=button name=TestJquery class=test
			value="Terminos y Condiciones">


		<div id="carouselExampleControls" class="carousel slide"
			data-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img class="img-fluid w-100 diapositiva"
						src="IMG/abstract-1238248_640.jpg" alt="First slide">
					<div class="carousel-caption d-none d-md-block">
						<h3>Sección de Pescaderia</h3>
						<p>Directo del mar a tu mesa</p>
					</div>
				</div>
				<div class="carousel-item">
					<img class="img-fluid w-100 diapositiva"
						src="IMG/fruits-82524_640.jpg" alt="Second slide">
					<div class="carousel-caption d-none d-md-block">
						<h3>Fruteria</h3>
						<p>El mejor producto nacional</p>
					</div>
				</div>
				<div class="carousel-item">
					<img class="img-fluid w-100 diapositiva"
						src="IMG/orange-juice-1921548_640.jpg" alt="Third slide">
					<div class="carousel-caption d-none d-md-block">
						<h3>Zumos y Nectares</h3>
						<p>Lo más refrescante del verano</p>
					</div>
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleControls"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleControls"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>

	</center>

</body>
</html>