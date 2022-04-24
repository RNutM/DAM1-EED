<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Hola mundo con PHP</title>
</head>
<body>
<h1>¡Hola mundo con PHP!</h1>
<p>
<?php
echo "La hora es: " . date("h:m:s") . "<br>";

echo "El dia es: " . date("d/m/y"). "<br>";

for ($i=0; $i<=25; $i++)

echo  $i . "\n";

for ($j=26; $j<=50; $j++)

echo  $j . "\n";
?>
</p>
</body>
</html>