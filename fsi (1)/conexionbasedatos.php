<?php

$conexion=pg_connect("host=localhost dbname= Melgar user=postgres password=Postgres");

if($conexion)
{
    echo "La conexión se realizo correctamente!";
}
else{
    echo "Ha ocurrido un error!";
}

$query= "SELECT DNI,NOMBRE,NACIM,ESTADO FROM USUARIOS";
$consulta=pg_query($conexion,$query);

if($consulta){

    if(pg_num_rows($consulta)>0){

        echo "<p>Lista en la base de datos.<br>";
        echo "<table border='1'><tr><th>DNI</th><th>NOMBRE</th><th>NACIMIENTO</th><th>ESTADO</th></tr><tr>";
        //echo "------------------- </p>";
        while ($obj = pg_fetch_object($consulta)) {
            //print_r($obj);
            echo "<tr><td>".$obj->dni."</td><td>".$obj->nombre."</td><td>".$obj->nacim."</td><td>".$obj->estado."</td><td></tr>";
            /*
            echo $obj[1]."<br>";
            echo $obj->DNI."<br>";
            echo $obj->NOMBRE."<br>";
            echo $obj->NACIM."<br>";
            echo $obj->ESTADO."<br>";*/
        }
        echo "</table>";
    }
}

?>