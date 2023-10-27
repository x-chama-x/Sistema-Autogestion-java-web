<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sistema Academico inicio de Sesion</title>
        <link rel="stylesheet" href="css/styles(2).css">
    </head>
    <body>
        <c:import url= "/header.jsp"/>
        <form class="form" method="post">
            <h4 class = formheader>Inicio de Sesion</h4>
            <div class="container">
                <div class="formgroup">
                    <label for="legajo" class="formlabel">Legajo: </label>
                    <input type="text" id="legajo" name="legajo" class="forminput">
                    <span class="formspan"></span>
                </div>
                <div class="formgroup"></div>
                    
                    <label for="password" class="formlabel">Contrasenia: </label>
                    <input type="password" id="password" name="contrasenia" class="forminput">
                    <span class="formspan"></span>
                </div>
                <br>
                <input type="submit" value="Ingresar" class="formingresar">
            </div>
        </form>
        <a href="./jsp/jsp_alumnos/MenuAlumno.jsp">atajoAlum</a>
        <a href="./jsp/jsp_profesor/MenuProfesor.jsp">atajoProfe</a>
    </body>
</html>