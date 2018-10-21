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
        <title>Login</title>
        <link href="../../assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../assets/css/estilo.css" rel="stylesheet" type="text/css"/>
        <%@include file="css.jsp" %>
    </head>
    <body>
        <div id="cuadro">
            <div id="cabeza">INICIO DE SECCION</div>
            
            <div id="cuerpo"> 
                <center>
                    <img src="../../assets/images/imagenes/no-profile-picture-icon-15.jpg" alt=""/>
                
                <form class="form-horizontal">   
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-3 control-label no-padding-rinht" >
                            <i class="ace-icon fa fa-user">Usuario</i>  
                        </label><br><br>
                        <label class="col-sm-9" >
                            <input type="text" class="form-control" id="inputEmail3" placeholder="usuario" required=""> 
                        </label>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label no-padding-rinht" >
                            <i class="ace-icon fa fa-key">Contraseña</i>  
                        </label><br><br>
                        <label class="col-sm-9" >
                            <input type="password" class="form-control " id="inputPassword3" placeholder="contraseña" required=""> 
                        </label>
                    </div>
                    
                    <button class="btn btn-success  " type="submit" id="botonlogin" onclick="location=`index.jsp`">
                        <i class="ace-icon fa fa-adn"></i>
                        Ingresar                         
                    </button>
                </form>
            </center>
            </div>  
        </div>
        
    </body>
</html>
