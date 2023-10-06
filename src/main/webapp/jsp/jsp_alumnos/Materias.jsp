<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema Academico Materias</title>
    <link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
    <c:import url= "/header.jsp"/>

    <table class="tablecontainer">
        <caption class = "tablecaption">Cursada del alumno</caption>
        <tr>
            <th class = "tableth">
                Materia
            </th>
        </tr>
        <tr>
            <td class="tabletd">
                Lengua
            </td>
        </tr>
        <tr>
            <td class="tabletd">
                Matematica
            </td>
        </tr>
        <tr>
            <td class="tabletd">
                Historia
            </td>
        </tr>
    </table>

    <a class = "asalir" href="./MenuAlumno.jsp">Salir</a>
 
</body>
</html>