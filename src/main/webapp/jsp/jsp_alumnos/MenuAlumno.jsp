<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema Academico Menu Alumnos</title>
    <link rel="stylesheet" href="../../css/styles(2).css">
</head>
<body>
    <c:import url= "/header.jsp"/>
    <nav class="navcontainer">
        <h4 class="navh4">${Usuario.apellido},${Usuario.nombre}</h4>
        <p>Curso: 1 año 2da division</p>
        <a href="materias" class="nava">Materias</a>
        <a href="calificaciones" class="nava">Calificaciones</a>
        <a href="../../index.jsp" class="nava">Salir</a>
    </nav>
</body>
</html>