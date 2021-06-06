Algoritmo Ejercicio18
	Escribir  "Ingrese un numero"
	leer num1
	
	@@ -10,10 +10,14 @@ Algoritmo sin_titulo
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
			@@ -22,6 +26,8 @@ Algoritmo sin_titulo
				D2= Subcadena(num1,2)
				D3= Subcadena(num1,3)
				D4= Subcadena(num1,4)
				
				Escribir "d1= ", D1,"d2= ", D2,"d3= ", D3,"d4= ", D4,"La suma es: ", suma
			Fin Si
			
		Fin Si