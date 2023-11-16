<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema Academico Usuario buscado</title>
    <link rel="stylesheet" href="../../../css/stylescomun.css">
    <link rel="stylesheet" href="../../../css/stylesmedia.css">
</head>
<body>
    <c:import url= "/header.jsp"/>

    <table class="tablecontainer">
        <!-- <caption class = "tablecaption">Cursada del alumno</caption> -->
        <tr>
            <th class = "tableth">
                mostrar informacion
            </th>
        </tr>
        <tr>
            <td class="tabletd">
                alejandro
            </td>
            
        </tr>
        <tr>
            <td class="tabletd">
                Quispe 
            </td>
        </tr>
        <tr>
            <td class="tabletd">
                Alejandro@hotmail.com 
            </td>
        </tr>
        <tr>
            <td class="tabletd">
                <a href="./EditarUsuario.jsp">editar informacion</a>
            </td>
        </tr>
    </table>

    <a class = "asalir" href="./BuscarUsuario.jsp">Salir</a>
 
</body>
</html>