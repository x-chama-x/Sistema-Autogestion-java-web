<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sistema Academico Administrar usuarios</title>
        <link rel="stylesheet" href="../../../css/stylescomun.css">
        <link rel="stylesheet" href="../../../css/stylesmedia.css">
    </head>
    <body>
        <c:import url= "/header.jsp"/>
        <form class="form" method="post">
            <h4 class = formheader>Administrar Usuarios</h4>
            <div class="container">
                <div class="formgroup">
                    <label for="id" class="formlabel">Id: </label>
                    <input type="text" id="id" name="id" class="forminput">
                    <span class="formspan"></span>
                </div>
                <br>
                <input type="submit" value="Ingresar" class="formingresar">
            </div>
        </form>
        <a href="../MenuAdmin.jsp" class="asalir"> salir</a>
        <a href="./MostrarUsuario.jsp">mostrarUser</a>
    </body>
</html>