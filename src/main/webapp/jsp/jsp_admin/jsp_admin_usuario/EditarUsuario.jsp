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
            <h4 class = formheader>Modificar datos</h4>
            <div class="container">
                <div class="formgroup">
                    <label for="nombre" class="formlabel">Nombre: </label>
                    <input type="text" id="nombre" name="nombre" class="forminput">
                    <span class="formspan"></span>
                </div>
                <br>
                <div class="formgroup">
                    <label for="apellido" class="formlabel">Apellido </label>
                    <input type="text" id="apellido" name="apellido" class="forminput">
                    <span class="formspan"></span>
                </div>
                <br>
                <div class="formgroup">
                    <label for="mail" class="formlabel">Mail </label>
                    <input type="email" id="mail" name="mail" class="forminput">
                    <span class="formspan"></span>
                </div>
                <br>
                <div class="formgroup">
                    <label for="clave" class="formlabel">contraseña </label>
                    <input type="password" id="clave" name="clave" class="forminput">
                    <span class="formspan"></span>
                </div>
                <br>
                <div class="formgroup">
                    <label for="estado" class="formlabel">Estado: </label>
                    <input type="text" id="estado" name="estado" class="forminput">
                    <span class="formspan"></span>
                </div>
                <br>
                <input type="submit" value="Ingresar" class="formingresar">
            </div>
        </form>
        <a class = "asalir" href="../MenuAdmin.jsp">Salir</a>
    </body>
</html>