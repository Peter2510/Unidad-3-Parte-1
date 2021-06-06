Algoritmo Ejercicio17
	
	Escribir  "Ingresa la medida del lado 1 del triangulo"
	Leer lado1
	
	Escribir  "Ingresa la medida del lado 2 del triangulo"
	Leer lado2
	
	Escribir  "Ingresa la medida del lado 3 del triangulo"
	Leer lado3
	
	Si lado1 =lado2 & lado2= lado3 Entonces
		Escribir  "El triangulo es equilatero"
	SiNo
		Si lado1 = lado2 Entonces
			Escribir  "El triangulo es isoceles"
		SiNo
			Si lado1 = lado3 Entonces
				Escribir  "El triangulo es isoceles"
			SiNo
				Si lado2 = lado3 Entonces
					Escribir  "El triangulo es isoceles"
				SiNo
					Escribir "El triangulo es escaleno"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	
	
FinAlgoritmo

