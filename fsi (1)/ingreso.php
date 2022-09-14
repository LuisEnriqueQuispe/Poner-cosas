<?php
session_start();
$usuario=$_SESSION['nombre_usuario'];
echo "<h1> Bienvenido $usuario</h1> que tenga un buen día :)";

?>