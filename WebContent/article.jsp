<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Gestion Snack</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/js/search.js"></script>
<br><br>
<button type="button" class="btn btn-primary btn-block"><h1>Bienvenu sur la nouvelle plateforme</h1></button>


<br>
<br>

<div class="center"><a href="AddArticle.jsp" class="btn btn-info" role="button">Ajouter Enregistrement</a></div>
	<hr />

	
	

	
	<div class="container spacer">
   <div class="panel panel-primary">
   <div class="panel-heading"></div>



<span class="glyphicon glyphicon-trash"></span>
<div class="panel-body">

<div class="form-group pull-left">
    <input type="text"  class="search form-control" placeholder="What you looking for?">
</div>
<table  class="table table-striped results">
		<tr class="danger">
			
			<th>Nom</th>
			<th>DESCRIPTION</th>
			<th>PRIX</th>
			
			<hr />
		<tr class="warning no-result">
      <td colspan="4"><i class="fa fa-warning"></i> No result</td>
    </tr>
		 </thead>
  <tbody>
		
		<!--  listeProduit  -->
		<sw:forEach items="${listearticle}" var="a" >
			<tr>
			
				<th>${a.nom }</th>
				<th>${a.description }</th>
				<th>${a.prix }</th>
				
				<th><a href="modifier.jsp"><img src="static/images/update.png" width="25" height="25"></a></th>
				<th><a href="deletPersonne.aspx?id=${a.id}"><img src="static/images/supprimer.png" width="25" height="25"></a></th>
			</tr>
		</sw:forEach>
		 </tbody>
	</table>
	</div>
</div>
</div>
	
</body>
</html>
	