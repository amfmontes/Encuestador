<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Encuesta</title>
</head>
<body>
<h2>Encuesta online de valoración</h2> 
<p>Para realizar la valoración del trabajo, asigne un número de 0 a 10 en los campos presentados en función de la 
puntuación personal que se le quiera otorgar, siendo 0 la menor nota o puntación y 10 la máxima.</p>
<form action="Suma" method="post">
Equipo a valorar: <input type="text" name="equipo"><br/><br/>
<p>Votos:</p>
<p>
1. Usabilidad.<br/>
<input type="text" name="usabilidad"><br/><br/>
2. Presentación.<br/>
<input type="text" name="presentacion"><br/><br/>
3. Diseño.<br/>
 3.1. Visual (¿es atractiva?)<br/>
 <input type="text" name="visual"><br/><br/>
 3.2. Sencillez (¿te parece qué está muy saturado visualmente?)<br/>
 <input type="text" name="sencillez"><br/><br/>
4. Facilidad de uso.<br/>
<input type="text" name="facilidad"><br/><br/>
5. Utilidad.<br/>
<input type="text" name="utilidad"><br/><br/>
6. Seguridad.<br/>
<input type="text" name="seguridad"><br/><br/>
7. Uso de recursos.<br/>
<input type="text" name="recursos"><br/><br/>
8. Consecución de los objetivos.<br/>
<input type="text" name="objetivos"><br/><br/>
9. Creatividad y originalidad.<br/>
<input type="text" name="creatividad"><br/><br/>
10. Puntos por resolución de problemas.<br/>
<input type="text" name="problemas"><br/><br/>

<input type="submit" value="Enviar votación">
</form>
</p>
</body>
</html>