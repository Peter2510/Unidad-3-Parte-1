Algoritmo Ejercicio18
	Escribir  "Ingrese un numero"
	leer num1
	
	Si num1 < 100000 Entonces
		
		Si num1 <= 100 Entonces
			D1= 0
			D2= 0
			D3= Subcadena(num1,3)
			D4= Subcadena(num1,4)
			
			suma = d3 + d4
			Escribir "d1= ", D1,"d2= ", D2,"d3= ", D3,"d4= ", D4,"La suma es: ", suma  
			
			SiNo
				Si num1 <= 1000 Entonces
					D1= 0
					D2= Subcadena(num1,2)
					Escribir "d1= ", D1,"d2= ", D2,"d3= ", D3,"d4= ", D4,"La suma es: ", suma
					D3= Subcadena(num1,3)
					D4= Subcadena(num1,4)
				SiNo
					Si num1 <= 1000 Entonces
						D1= Subcadena(num1,1)
						D2= Subcadena(num1,2)
						D3= Subcadena(num1,3)
						D4= Subcadena(num1,4)
						
						Escribir "d1= ", D1,"d2= ", D2,"d3= ", D3,"d4= ", D4,"La suma es: ", suma
				Fin Si
			
		Fin Si
		
	Fin Si
FinAlgoritmo
