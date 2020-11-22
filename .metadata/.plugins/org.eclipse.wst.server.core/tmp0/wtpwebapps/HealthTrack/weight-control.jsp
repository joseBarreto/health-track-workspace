<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Peso</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>

	<div class="main-container">
		<div class="pd-ltr-20 xs-pd-20-10">
			<div class="min-height-200px">
				<div class="pd-20 card-box mb-30">
					<div class="clearfix">
						<div class="pull-left">
							<h4 class="text-blue h4">Controle de peso</h4>
							<p class="mb-30">Gerencie o seu historico de peso</p>
						</div>
						<div class="pull-right">
							<a href="weight-control-register.jsp"
								class="btn btn-primary btn-sm scroll-click" role="button"><i
								class="fa fa-plus"></i> Adicionar</a>
						</div>
					</div>
					<div class="pb-20">
						<c:if test="${not empty msg }">
							<div class="alert alert-success">${msg}</div>
						</c:if>
						<c:if test="${not empty erro }">
							<div class="alert alert-danger">${erro}</div>
						</c:if>
						<table class="data-table table stripe hover nowrap">
							<thead>
								<tr>
									<th>Codigo</th>
									<th>Peso</th>
									<th>Data do registro</th>
									<th>Observação</th>
									<th class="datatable-nosort">Ações</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${pesos}" var="p">
									<tr>
										<td>${p.id_historico_peso}</td>
										<td>${p.peso}</td>
										<td><fmt:formatDate value="${p.dt_cadastro.time }"
												pattern="dd/MM/yyyy" /></td>
										<td>${p.ob_observacao}</td>
										<td>
											<div class="dropdown">
												<a
													class="btn btn-link font-24 p-0 line-height-1 no-arrow dropdown-toggle"
													href="#" role="button" data-toggle="dropdown"> <i
													class="dw dw-more"></i>
												</a>
												<div
													class="dropdown-menu dropdown-menu-right dropdown-menu-icon-list">
													<a class="dropdown-item" href="#"><i class="dw dw-eye"></i>View</a>

													<c:url value="weightControl" var="linkEditar">
														<c:param name="acao" value="abrir-form-edicao" />
														<c:param name="codigo" value="${p.id_historico_peso }" />
													</c:url>

													<a class="dropdown-item" href="${linkEditar }"><i
														class="dw dw-edit2"></i> Editar</a> <a class="dropdown-item"
														data-toggle="modal" data-target="#excluirModal"
														type="button"
														onclick="codigoExcluir.value = ${p.id_historico_peso}"><i
														class="dw dw-delete-3"></i> Excluir</a>
												</div>
											</div>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>


	<div class="modal fade" id="excluirModal" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-body text-center font-18">
					<h4 class="padding-top-30 mb-30 weight-500">Você tem certeza
						que quer continuar?</h4>
					<div class="padding-bottom-30 row"
						style="max-width: 170px; margin: 0 auto;">
						<form action="weightControl" method="post">
							<div class="row">
								<input type="hidden" name="acao" value="excluir"> <input
									type="hidden" name="codigo" id="codigoExcluir">
							</div>
							<div class="row">
								<div class="col">
									<button type="button"
										class="btn btn-secondary border-radius-100 btn-block confirmation-btn"
										data-dismiss="modal">
										<i class="fa fa-times"></i>
									</button>
									Não
								</div>
								<div class="col">
									<button type="submit"
										class="btn btn-primary border-radius-100 btn-block confirmation-btn">
										<i class="fa fa-check"></i>
									</button>
									Sim
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%@ include file="footer.jsp"%>

	<script src="src/plugins/datatables/js/jquery.dataTables.min.js"></script>
	<script src="src/plugins/datatables/js/dataTables.bootstrap4.min.js"></script>
	<script src="src/plugins/datatables/js/dataTables.responsive.min.js"></script>
	<script src="src/plugins/datatables/js/responsive.bootstrap4.min.js"></script>
	<script src="src/scripts/datatable-setting.js"></script>
</body>
</html>