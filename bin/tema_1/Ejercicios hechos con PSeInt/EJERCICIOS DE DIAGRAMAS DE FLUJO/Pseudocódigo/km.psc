Algoritmo Kilometros
	Escribir 'Introduce Km a transformar'
	Leer km
	Escribir 'Introduce op'
	Leer op
		Segun op Hacer
			'cm':
				resultado <- km*10000
				Escribir 'Los ', km, ' km son ', resultado,' cm ..'
			'm':
				resultado <- km*1000
				Escribir 'Los ', km, ' km son ', resultado,' metros ..'
			De Otro Modo:
				Escribir 'Opción incorrecta'
		Fin Segun
	
FinAlgoritmo
