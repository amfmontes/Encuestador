<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Votaciones</title>
</head>
<body>
	<h2>Resultados de votaciones</h2>

	<p>Así van las votaciones por ahora:</p>


	<table class="table table-striped">
		<thead>
			<tr>
				<th>Equipo</th>
				<th>Puntos</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaVotaciones}" var="votos">
				<p>
				<tr>
					<td><c:out value="${votos.equipo}"></c:out></td>
					<td><c:out value="${votos.suma}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>