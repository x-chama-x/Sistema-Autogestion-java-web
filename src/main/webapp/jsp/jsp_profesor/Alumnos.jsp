<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- 
    Document   : Alumnos
    Created on : 2 nov. 2023, 00:45:48
    Author     : Francisco
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Alumnos del Curso</title>
    <link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
    <c:import url="/header.jsp"/>
    <table class="tablecontainer">
        <caption class="tablecaption">Alumnos del Curso</caption>
        <tr>
            <th class="tableth">
                Nombre
            </th>
            <th class="tableth">
                Apellido
            </th>
            <th class="tableth">
                Email
            </th>
            <th class="tableth">
                Estado
            </th>
        </tr>

        <c:choose>
            <c:when test="${empty alumnos}">
                <tr>
                    <td class="tabletd" colspan="4">
                        No hay alumnos
                    </td>
                </tr>
            </c:when>
            <c:otherwise>
                <c:forEach items="${alumnos}" var="alumno">
                    <tr>
                        <td class="tabletd">
                            ${alumno.nombre}
                        </td>
                        <td class="tabletd">
                            ${alumno.apellido}
                        </td>
                        <td class="tabletd">
                            ${alumno.email}
                        </td>
                        <td class="tabletd">
                            ${alumno.estado}
                        </td>
                    </tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </table>
    <a class="asalir" href="./MenuProfesor.jsp">Salir</a>
</body>
</html>

