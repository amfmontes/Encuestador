<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Votaciones</title>
</head>
<body>
<h2>Resultados de votaciones</h2>

<p> Así van las votaciones por ahora:</p>


<jsp:useBean id="votacion" class="com.basico.SumaPojo" scope="session">
<jsp:setProperty property="equipo" name="votacion"/>
<jsp:setProperty property="suma" name="votacion"/>
</jsp:useBean>
Equipo: <jsp:getProperty property="equipo" name="votacion"/><br/>
Votación: <jsp:getProperty property="suma" name="votacion"/> puntos de 100.<br/>


</body>
</html>