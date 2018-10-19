<%@page import="modelado.DAOAlmacen" %>
<%@page import="java.util.*" %>
<%@page import="uml.Almacen" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vista Almacen</title>
    </head>
    <body>
        <%
            DAOAlmacen a = new DAOAlmacen();
            List<Almacen> datos = new ArrayList();
        %>
        <form name="formAlmacen" method="POST" action="SERVAlmacen">
            <p>Código almacén <input type="text" name="txtcodigo"/></p>
            <p>Nombre almacén <input type="text" name="txtnombre"/></p>
            <p>Teléfono almacén <input type="text" name="txttelefono"/></p>
            <p>Correo almacén <input type="email" name="txtcorre"/></p>
            <p>Dirección almacén <input type="text" name="txtdireccion"/></p>
            <input type="submit" value="Guardar"/>
        </form>
        <hr>
    <center>
        <table border="1">
            <thead>
                <tr>
                    <th>Código almacén</th>
                    <th>Nombre alamacén</th>
                    <th>Teléfono alamacén</th>
                    <th>Correo almacén</th>
                    <th>Dirección alamacén</th>
                </tr>
            </thead>
            <tbody>
                <%
                    datos = a.consultar();
                    for (Almacen i : datos) {
                %>
                <tr>
                    <td><%= i.getCodigo_almacen()%></td>
                    <td><%= i.getNombre_almacen()%></td>
                    <td><%= i.getTelefono_almacen()%></td>
                    <td><%= i.getCorreo_almacen()%></td>
                    <td><%= i.getDireccion_almacen()%></td>
                </tr>
                <%
                    }
                %>

            </tbody>
        </table>
    </center>
</body>
</html>
