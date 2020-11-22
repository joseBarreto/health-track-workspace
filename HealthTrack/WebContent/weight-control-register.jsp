<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar peso</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<div class="main-container">
		<div class="pd-ltr-20 xs-pd-20-10">
			<div class="min-height-200px">
				<div class="pd-20 card-box mb-30">
					<form action="weightControl" method="post">

						<c:if test="${peso.id_historico_peso == null }">
							<input type="hidden" value="cadastrar" name="acao">
						</c:if>
						<c:if test="${peso.id_historico_peso > 0 }">
							<input type="hidden" value=editar name="acao">
						</c:if>

						<input type="hidden" name="codigo"
							value="${peso.id_historico_peso }">
						<div class="form-group row">
							<label class="col-sm-12 col-md-2 col-form-label">Peso</label>
							<div class="col-sm-12 col-md-10">
								<input class="form-control" value="${peso.peso}" type="number"
									name="peso">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-sm-12 col-md-2 col-form-label">Data da
								pesagem</label>
							<div class="col-sm-12 col-md-10">
								
								<input
							type="date" name="dt_cadastro"
							class="form-control"
							value='<fmt:formatDate value="${peso.dt_cadastro.time }" pattern="yyyy-MM-dd"/>'>
							</div>
						</div>

						<div class="form-group">
							<label>Observação</label>
							<textarea class="form-control" name="observacao" maxlength="500">${peso.ob_observacao }</textarea>
						</div>
						<button type="submit" class="btn btn-primary">Enviar</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>