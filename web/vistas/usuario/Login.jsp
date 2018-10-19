<%-- 
    Document   : Login
    Created on : 16-oct-2018, 19:16:22
    Author     : jgtan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../bootstrap/css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="cuadro">
            <div id="cabeza">INICIO DE SECCION</div>
            <div id="cuerpo"> 
                <center>
                        <img src="../../bootstrap/imagenes/no-profile-picture-icon-15.jpg" alt=""/>
                </center>
                <form class="form-horizontal">                   
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label " >USUARIO</label><br><br>
                        <img src="../../bootstrap/imagenes/user-green_25326.png" alt=""/>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputEmail3" placeholder="usuario" required="">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">CONTRASEÑA</label><br><br>
                        <img src="../../bootstrap/imagenes/padlock_77987.png" alt=""/>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="contraseña" required="">
                        </div>
                    </div>
                    <div class="form-group" >
                        <div class="col-sm-offset-2 col-sm-1">
                            <button type="submit"  class="btn btn-success " id="botonlogin">INGRESAR</button>
                        </div>
                    </div>
                </form>
            </div>  
        </div>
    </body>
</html>
