Algoritmo Ejercicio20
	
	Escribir "Ingresa un numero"
	leer Num
	
	Si Num > 9999 & N < 100000  Entonces
	
		convertir = ConvertirATexto(Num)
		A = Subcadena(convertir,0,1)
		B = Subcadena(convertir,2,2)
		C = Subcadena(convertir,3,3)
		D = Subcadena(convertir,4,4)
		E = Subcadena(convertir,5,5)
		
		Si A=E y B=D  Entonces
			Escribir "El numero es capicua"
		SiNo
			Escribir "El numero no es capicua"
		Fin Si

	SiNo
		Escribir "Ingrese un numero de 5 digitos"
	Fin Si
	
FinAlgoritmo
