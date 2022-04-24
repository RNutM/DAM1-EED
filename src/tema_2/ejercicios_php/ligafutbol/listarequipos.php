<!DOCTYPE html>
<html lang="es_ES">
<head>
	<meta charset="UTF-8">
	<title>Listado de equipos de primera división</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>



<table border=' 1' class="table table-striped">
<tr>
<th>ID</th>
<th>NOMBRE DEL EQUIPO</th>
<th>LOCALIDAD</th>
</tr>




<?php
//////////////////////////////////////////////////////////////////////
/////////////DATOS DE ACCESO A LA BD//////////////////////////////////
//////////////////////////////////////////////////////////////////////
$usuario = "root"; //usuario a la base de datos
$contrasena = ""; // Contraseña root a la base de datos
$servidor = "localhost"; //localhost o ip del servidor de base de datos
$basededatos = "ligafutbol"; //nombre de la base de datos
//////////////////////////////////////////////////////////////////////
/////////////CONEXIÓN CON EL SGBD//////////////////////////////////
//////////////////////////////////////////////////////////////////////
$conexion = mysqli_connect($servidor, $usuario, "" ) or die ("No se ha podido conectar al servidor de Base de datos");
$conexion->set_charset("utf8");
//Conexión con la base de datos
$db = mysqli_select_db( $conexion, $basededatos ) or die ( "Upps! Pues va a ser que no se ha podido conectar a la base de datos" );
/////////////////////////////////////////////////////////////////////
/////////////REALIZAMOS LA CONSULTA A LA BD//////////////////////////////////
//////////////////////////////////////////////////////////////////////
//Consulta de todos los equipos
$consulta = "SELECT * FROM equipos";
//resultado de la consulta
$resultado = mysqli_query( $conexion, $consulta ) or die ( "Algo ha ido mal en la consulta a la base de datos");
/////////////////////////////////////////////////////////////////////
/////////////IMPRESIÓN DE LOS DATOS OBTENIDOS EN LA CONSULTA/////////////
//////////////////////////////////////////////////////////////////////
//empezamos a imprimir los resultados

//recorremos los resultados de la consulta
while ($registro = mysqli_fetch_array( $resultado ))
{
echo "<tr>";
echo "<td>".$registro['ID_EQUIPO']."</td>";
echo "<td>".$registro['NOMBRE_EQUIPO']."</td>";
echo "<td>".$registro['LOCALIDAD']."</td>";
echo "</tr>";
}
echo "</table>";
//Cerramos la conexión
mysqli_close( $conexion );
?>




</body>
</html>