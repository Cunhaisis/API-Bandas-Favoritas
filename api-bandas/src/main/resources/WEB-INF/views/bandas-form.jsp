<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bandas Fvoritas |</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">Bandas Favoritas</h2>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add Banda</div>
				</div>
				<div class="panel-body">
					<form:form action="saveBandas" cssClass="form-horizontal"
						method="post" modelAttribute="bandas">

						<!-- need to associate this data with customer id -->
						<form:hidden path="id" />

						<div class="form-group">
							<label for="name" class="col-md-3 control-label">Nome</label>
							<div class="col-md-9">
								<form:input path="name" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="vocalista" class="col-md-3 control-label">Vocalista</label>
							<div class="col-md-9">
								<form:input path="vocalista" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="genero" class="col-md-3 control-label">Genero</label>
							<div class="col-md-9">
								<form:input path="genero" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="musicaFav" class="col-md-3 control-label">Musica
								Favorita</label>
							<div class="col-md-9">
								<form:input path="musicaFav" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="albumFav" class="col-md-3 control-label">Album
								Favorito</label>
							<div class="col-md-9">
								<form:input path="albumFav" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>