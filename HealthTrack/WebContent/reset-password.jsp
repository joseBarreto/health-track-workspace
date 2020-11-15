<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Basic Page Info -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Health Track - Recuperar senha</title>

<!-- Site favicon -->
<link rel="icon" type="image/png" sizes="32x32"
	href="src/images/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="src/images/favicon-16x16.png">

<!-- Mobile Specific Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap"
	rel="stylesheet">
<!-- CSS -->
<link rel="stylesheet" type="text/css" href="src/styles/core.css">
<link rel="stylesheet" type="text/css"
	href="src/styles/icon-font.min.css">
<link rel="stylesheet" type="text/css" href="src/styles/style.css">
</head>
<body>
	<div class="login-header box-shadow">
		<div
			class="container-fluid d-flex justify-content-between align-items-center">
			<div class="navbar-header">
				<a class="navbar-brand" href="login.jsp"><img
					src="src/images/deskapp-logo.svg" alt="" class="light-logo"></a>
			</div>
			<div class="login-menu">
				<ul>
					<li><a href="login.html">Login</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div
		class="login-wrap d-flex align-items-center flex-wrap justify-content-center">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-md-6">
					<img src="src/images/forgot-password.png" alt="">
				</div>
				<div class="col-md-6">
					<div class="login-box bg-white box-shadow border-radius-10">
						<div class="login-title">
							<h2 class="text-center text-primary">Resetar senha</h2>
						</div>
						<h6 class="mb-20">Insira sua nova senha</h6>
						<form>
							<div class="input-group custom">
								<input type="text" class="form-control form-control-lg"
									placeholder="New Password">
								<div class="input-group-append custom">
									<span class="input-group-text"><i class="dw dw-padlock1"></i></span>
								</div>
							</div>
							<div class="input-group custom">
								<input type="text" class="form-control form-control-lg"
									placeholder="Confirm New Password">
								<div class="input-group-append custom">
									<span class="input-group-text"><i class="dw dw-padlock1"></i></span>
								</div>
							</div>
							<div class="row align-items-center">
								<div class="col-5">
									<div class="input-group mb-0">
										<!--
											use code for form submit
											<input class="btn btn-primary btn-lg btn-block" type="submit" value="Submit">
										-->
										<a class="btn btn-primary btn-lg btn-block" href="index.jsp">Enviar</a>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>