<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<%-- 
    Document   : Cursos
    Created on : 8 oct. 2023, 18:57:31
    Author     : Francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema Academico Calificaciones</title>
    <link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
    <c:import url= "/header.jsp"/>
    <table class="tablecontainer">
        <caption class = "tablecaption">Cursos del profesor</caption>
        <tr>
            <th class = "tableth">
                Cursos
            </th>
        </tr>
        <tr>
            <td class="tabletd">
                1° 2da <a href="http://" class="tablelink"> ver alumnos</a>
            </td>
        </tr>
        <tr>
            <td class="tabletd">
                2° 2da <a href="http://" class="tablelink"> ver alumnos</a>
            </td>
        </tr>
    </table>
    <a class = "asalir" href="./MenuProfesor.jsp">Salir</a>
</body>
</html>
