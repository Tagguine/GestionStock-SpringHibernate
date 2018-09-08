<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Gestion Snack</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
<br>
<button type="button" class="btn btn-primary btn-block"><h1>Bienvenu sur la nouvelle plateforme</h1></button>
<br><br><br><br><br><br>

	<form action="addarticle.aspx" method="post">
	<div class="container spacer">
<div class="panel panel-primary">
<div class="panel-heading"></div>
<div class="panel-body">
<table class="table table-striped">

		
			<tr>
				<th>Nom</td>
				<th><input type="text" name="nom" /></th>
			</tr>
			
		<tr>
				<th>DESCRIPTION</td>
				<th><input type="text" name="description" /></th>
			</tr>
			<tr>
				<th>PRIX</td>
				<th><input type="text" name="prix" /></th>
			</tr>
			
			<tr>
				<td colspan="1">
				<button class="btn btn-primary" (click)="" style="position: absolute;left: 500px">  Ajouter  </button>	 
				
				</td>
			</tr>
		</table>
</div>
</div>
</div>
	</form>
</body>
</html>
	