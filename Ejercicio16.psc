Algoritmo Ejercicio16
	
	Escribir  "Ingresa un numero"
	Leer numero1
	
	Escribir  "Ingresa un numero"
	Leer numero2
	
	Escribir  "Ingresa un numero"
	Leer numero3
	
	Si numero1 > numero2 Entonces
		Si numero1 > numero3 Entonces
			Escribir "El mayor de los numeros ingresados es: ", numero1
		SiNo
			Escribir  "El mayor de los numeros ingresados es: ", numero3
		Fin Si
	SiNo
		Si numero2 > numero3 Entonces
			Escribir  "El mayor de los numeros ingresados es: ", numero2
		SiNo
			Escribir  "El mayor de los numeros ingresados es: ", numero3
		Fin Si
	Fin Si


	
FinAlgoritmo
