<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<!-- Basic Page Info -->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Health Track - Cadastro</title>

	<!-- Site favicon -->
	<link rel="icon" type="image/png" sizes="32x32" href="src/images/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="16x16" href="src/images/favicon-16x16.png">

	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- Google Font -->
	<link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="src/styles/core.css">
	<link rel="stylesheet" type="text/css" href="src/styles/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="src/plugins/jquery-steps/jquery.steps.css">
	<link rel="stylesheet" type="text/css" href="src/styles/style.css">
</head>

<body class="login-page">
	<div class="login-header box-shadow">
		<div class="container-fluid d-flex justify-content-between align-items-center">
			<div class="brand-logo">
				<a href="login.html">
					<img src="src/images/deskapp-logo.svg" alt="">
				</a>
			</div>
			<div class="login-menu">
				<ul>
					<li><a href="login.jsp">Entrar</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="register-page-wrap d-flex align-items-center flex-wrap justify-content-center">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-md-6 col-lg-7">
					<img src="src/images/register-page-img.png" alt="">
				</div>
				<div class="col-md-6 col-lg-5">
					<div class="register-box bg-white box-shadow border-radius-10">
						<div class="wizard-content">
							<form class="tab-wizard2 wizard-circle wizard">
								<h5>Dados b�sicos da conta</h5>
								<section>
									<div class="form-wrap max-width-600 mx-auto">
										<div class="form-group row">
											<label class="col-sm-4 col-form-label">Email*</label>
											<div class="col-sm-8">
												<input type="email" class="form-control" required />
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-4 col-form-label">Nome de usu�rio*</label>
											<div class="col-sm-8">
												<input type="text" class="form-control">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-4 col-form-label">Senha*</label>
											<div class="col-sm-8">
												<input type="password" class="form-control">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-4 col-form-label">Confirma��o da senha*</label>
											<div class="col-sm-8">
												<input type="password" class="form-control">
											</div>
										</div>
									</div>
								</section>
								<!-- Step 2 -->
								<h5>Informa��es pessoais</h5>
								<section>
									<div class="form-wrap max-width-600 mx-auto">
										<div class="form-group row">
											<label class="col-sm-4 col-form-label">Nome completo*</label>
											<div class="col-sm-8">
												<input type="text" class="form-control">
											</div>
										</div>
										<div class="form-group row align-items-center">
											<label class="col-sm-4 col-form-label">G�nero*</label>
											<div class="col-sm-8">
												<div class="custom-control custom-radio custom-control-inline pb-0">
													<input type="radio" id="male" name="gender" class="custom-control-input">
													<label class="custom-control-label" for="male">Masculino</label>
												</div>
												<div class="custom-control custom-radio custom-control-inline pb-0">
													<input type="radio" id="female" name="gender" class="custom-control-input">
													<label class="custom-control-label" for="female">Feminino</label>
												</div>
											</div>
										</div>
									</div>
								</section>
								<!-- Step 4 -->
								<h5>Informa��es gerais</h5>
								<section>
									<div class="form-wrap max-width-600 mx-auto">
										<ul class="register-info">
											<li>
												<div class="row">
													<div class="col-sm-4 weight-600">Email</div>
													<div class="col-sm-8">user@fiap.com.br</div>
												</div>
											</li>
											<li>
												<div class="row">
													<div class="col-sm-4 weight-600">Nome de usu�rio</div>
													<div class="col-sm-8">Fiap</div>
												</div>
											</li>
											<li>
												<div class="row">
													<div class="col-sm-4 weight-600">Password</div>
													<div class="col-sm-8">.....000</div>
												</div>
											</li>
											<li>
												<div class="row">
													<div class="col-sm-4 weight-600">Nome completo</div>
													<div class="col-sm-8">Fiap Melhor Escola</div>
												</div>
											</li>
										</ul>
										<div class="custom-control custom-checkbox mt-4">
											<input type="checkbox" class="custom-control-input" id="customCheck1">
											<label class="custom-control-label" for="customCheck1">Li e concordo com os termos de servi�o e pol�tica de privacidade</label>
										</div>
									</div>
								</section>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- success Popup html Start -->
	<button type="button" id="success-modal-btn" hidden data-toggle="modal" data-target="#success-modal" data-backdrop="static">Launch modal</button>
	<div class="modal fade" id="success-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered max-width-400" role="document">
			<div class="modal-content">
				<div class="modal-body text-center font-18">
					<h3 class="mb-20">Cadastro efetuado com sucesso!</h3>
					<div class="mb-30 text-center"><img src="src/images/success.png"></div>					
				</div>
				<div class="modal-footer justify-content-center">
					<a href="login.jsp" class="btn btn-primary">Pronto!</a>
				</div>
			</div>
		</div>
	</div>
	<!-- success Popup html End -->
	<!-- js -->
	<script src="src/scripts/core.js"></script>
	<script src="src/scripts/script.min.js"></script>
	<script src="src/scripts/process.js"></script>
	<script src="src/scripts/layout-settings.js"></script>
	<script src="src/plugins/jquery-steps/jquery.steps.js"></script>
	<script src="src/scripts/steps-setting.js"></script>
</body>

</html>