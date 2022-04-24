<!DOCTYPE html>
<html>
<head>
<title>Mi primer script PHP</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
</head>
<body>
<?php
///////////////////////////////////////////////////////////////////////
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
echo "<table border=' 1' class='table-striped' width='100%'>";
echo "<tr>";
echo "<th>ID</th>";
echo "<th>NOMBRE DEL EQUIPO</th>";
echo "<th>LOCALIDAD</th>";
echo "</tr>";
//recorremos los resultados de la consulta
while ($registro = mysqli_fetch_array( $resultado ))
{
echo "<tr>";
echo "<td>".$registro[ 'ID_EQUIPO']."</td>";
echo "<td>".$registro[ 'NOMBRE_EQUIPO']."</td>";
echo "<td>".$registro[ 'LOCALIDAD']."</td>";
echo "</tr>";
}
echo "</table>";

//Prueba del atletico de madrid
$id_equipo = $_GET["id_equipo"];
echo "<h1>Listado de Jugadores:Atlético de Madrid </h1>";

$consulta = "SELECT * FROM jugadores WHERE id_equipo=".$_GET["id_equipo"];
$resultado = mysqli_query( $conexion, $consulta ) or die ( "Algo ha ido mal en la consulta a la base de datos");
/////////////////////////////////////////////////////////////////////
/////////////IMPRESIÓN DE LOS DATOS OBTENIDOS EN LA CONSULTA/////////////
//////////////////////////////////////////////////////////////////////
//empezamos a imprimir los resultados
echo "<table border=' 1' class='table-striped' width='100%'>";
echo "<tr>";
echo "<th>ID_JUGADOR</th>";
echo "<th>NOMBRE DEL JUGADOR</th>";
echo "<th>EQUIPO</th>";
echo "</tr>";
//recorremos los resultados de la consulta
while ($registro2 = mysqli_fetch_array( $resultado ))
{
echo "<tr>";
echo "<td>".$registro2['ID_JUGADOR']."</td>";
echo "<td>".$registro2['NOMBRE']."</td>";
echo "<td>".$registro2['ID_EQUIPO']."</td>";
echo "</tr>";
}
echo "</table>";

//Prueba de caja de texto
//Ha salido y no se como, ahora hay que cambiar porque siempre sale 
//Atletico de madrid
echo "<form method='GET'>";
echo "Introduce el ID del equipo que quieres buscar los jugadores<input type='text' name='id_equipo'>";
echo "<input type='submit' value='Enviar'>";
echo "</form>";

//Cerramos la conexión
mysqli_close( $conexion );
?>
<?php


?>
</body>
</html>