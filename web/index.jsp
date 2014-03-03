<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="etiquetacustom" prefix="parametros" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Custom tag con parametros</h1>
        <form name="form1">
            Introduzca su nombre<input type="text" name="txtnombre"/><br>
            <input type="submit" value="Mostrar saludo"/>
            <%if (request.getParameter("txtnombre") != null)
              {
                String dato = request.getParameter("txtnombre");%>
                <parametros:mostrarsaludo nombre="<%=dato%>" />    
            <%}%>
        </form>
    </body>
</html>
