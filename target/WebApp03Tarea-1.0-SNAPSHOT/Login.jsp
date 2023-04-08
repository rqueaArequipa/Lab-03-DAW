<%-- 
    Document   : Login
    Created on : Apr 8, 2023, 2:26:50 PM
    Author     : 51946
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css"
              integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="static/css/style.css"/>
        <title>Lab - 03</title>
    </head>

    <body>
        <!-- HEADER -->
        <div class="container-header">
            <header>
                <div class="logo">
                    <a href="#">QJ Developer</a>
                </div>
                <nav id="nav">
                    <ul>
                        <li><a href="index.html" onclick="seleccionar()"><i class="fa-solid fa-house"></i> INICIO</a></li>
                    </ul>
                </nav>
                <div class="nav-responsive" onclick="mostrarOcultarMenu()">
                    <i class="fa-solid fa-bars"></i>
                </div>
            </header>
        </div>

        <!-- ------MAIN---------->
        <section id="home" class="home">
            <div class="content-banner">
                <div class="container-img">
                    <img src="static/img/login_1.jpg" alt="">
                </div>
                <h1>LOGIN</h1>
                <div class="lab">
                    
                    <form name="form" action="verificarLogin" method="post">
                        <div class="credenciales">
                            <label for="exampleInputEmail1">USER</label>
                        </div>
                        <div class="login">
                            <input type="text" name="xusu" id="exampleInputEmail1" aria-describedby="emailHelp">
                        </div>
                        <div class="credenciales">
                            <label for="exampleInputPassword1" >PASSWORD</label>
                        </div>
                        <div class="login">
                            <input type="password" name="xpas" id="exampleInputPassword1">
                        </div>
                        <button type="submit" class="btn btn-primary">INICIAR SESIÓN</button>
                    </form>
                    
                </div>
            </div>
        </section>

        <!-- footer -->
        <footer>
            <a href="#home" class="arriba">
                <i class="fa-solid fa-angles-up"></i>
            </a>
            <div class="redes">
                <a href="#"><i class="fa-brands fa-facebook-f"></i></a>
                <a href="#"><i class="fa-brands fa-instagram"></i></a>
                <a href="#"><i class="fa-brands fa-github"></i></a>
                <a href="#"><i class="fa-brands fa-discord"></i></a>
            </div>
        </footer>

        <script src="static/js/script.js"></script>
    </body>

</html>