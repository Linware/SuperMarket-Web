<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Formulario de Registro de Usuarios</title>
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
		<h1><img src="IMG/shopping-cart-2020929_640.png" alt="Logo" class="logo">Creación de nuevo usuario</h1>
		<form>
  <div class="form-row">
      <div class="form-group col-md-6">
      <label for="inputUsuario" class="col-form-label">Usuario</label>
      <input type="usuario" class="form-control" id="inputEmail4" placeholder="Jose">
    </div>
    <div class="form-group col-md-6">
      <label for="inputEmail4" class="col-form-label">Email</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4" class="col-form-label">Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
      <div class="form-group col-md-6">
      <label for="inputPassword5" class="col-form-label">Confirmación Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="Re-introduzca el Password">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress" class="col-form-label">Dirección</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="Calle...">
  </div>
  <div class="form-group">
    <label for="inputAddress2" class="col-form-label">Dirección 2</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartamento, estudio, o piso">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity" class="col-form-label">Ciudad</label>
      <input type="text" class="form-control" id="inputCity">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState" class="col-form-label">Provincia</label>
      <select id="inputState" class="form-control">Elige:
      <option value="1">Bilbao</option>
      <option value="2">Barcelona</option>
      <option value="3">Madrid</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip" class="col-form-label">Código Postal</label>
      <input type="text" class="form-control" id="inputZip">
    </div>
  </div>
 
  <button type="submit" class="btn btn-primary">Registrarse</button>
</form>
	</center>
</body>
</html>