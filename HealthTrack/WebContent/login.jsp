<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<!-- Basic Page Info -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Health Track - Login</title>
<%@ include file="header.jsp"%>
</head>

<body class="login-page">

	<div class="login-header box-shadow">
		<div
			class="container-fluid d-flex justify-content-between align-items-center">
			<div class="navbar-header">
				<a class="navbar-brand" href="login.jsp"><img
					src="src/images/deskapp-logo.svg" alt="" class="light-logo"></a>
			</div>
			<div class="login-menu">
				<ul>
					<li><a href="register.jsp">Registrar</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div
		class="login-wrap d-flex align-items-center flex-wrap justify-content-center">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-md-6 col-lg-7">
					<img src="src/images/login-page-img.png" alt="">
				</div>
				<div class="col-md-6 col-lg-5">
					<div class="login-box bg-white box-shadow border-radius-10">
						<div class="login-title">
							<h2 class="text-center text-primary">Entrar no Health Track</h2>
						</div>
						<c:if test="${not empty msg }">
							<div class="alert alert-success">${msg}</div>
						</c:if>
						<c:if test="${not empty erro }">
							<div class="alert alert-danger">${erro}</div>
						</c:if>
						<form id="frmLogin" action="login" method="post">
							<input type="hidden" value="login" name="acao">
							<div class="input-group custom">
								<input type="email" class="form-control form-control-lg"
									placeholder="E-mail" required name="email">
								<div class="input-group-append custom">
									<span class="input-group-text"><i
										class="icon-copy dw dw-user1"></i></span>
								</div>
							</div>
							<div class="input-group custom">
								<input type="password" class="form-control form-control-lg"
									placeholder="Senha" required name="senha">
								<div class="input-group-append custom">
									<span class="input-group-text"><i class="dw dw-padlock1"></i></span>
								</div>
							</div>

							<div class="row">
								<div class="col-sm-12">
									<div class="input-group mb-0">
										<!--
											use code for form submit
											<input class="btn btn-primary btn-lg btn-block" type="submit" value="Sign In">
										-->
										<input type="submit" class="btn btn-primary btn-lg btn-block" value="Entrar">

									</div>
									<div class="font-16 weight-600 pt-10 pb-10 text-center"
										data-color="#707373">OU</div>
									<div class="input-group mb-0">
										<a class="btn btn-outline-primary btn-lg btn-block"
											href="register.jsp">Criar uma nova conta</a>
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