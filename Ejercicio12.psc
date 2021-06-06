Algoritmo Ejercicio12
	
	Escribir "Ingrese el radio del cilindro"
	leer radio
	Si radio > 0 Entonces
		
		Escribir" Ingrese la altura del cilindro "
		leer altura
		Si altura > 0 Entonces
			p = 3.1416
			volumen = p * (radio*radio) * altura
			
			Escribir " El volumen del cilindro con radio de " ,radio , " unidades y con altura de " , altura , " unidades es de " ,volumen , " unidades cubicas"
		SiNo
			Escribir "Ingrese una altura positiva"
		Fin Si
		
	SiNo
		Escribir "Ingrese un radio positivo"
	Fin Si
FinAlgoritmo
