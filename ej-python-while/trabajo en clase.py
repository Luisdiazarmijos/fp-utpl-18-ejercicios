print ("calificaciones")
nota = 0
limite = 4
promedio = 0
contador =1
suma= 0
cadena= "{0}\t{1:>10}\t{2:>20}\t{3:>20}\t{4:>20}\t\t\n".format("Nombre","Nota1","Nota2", "Nota3","Promedio")
while contador <= limite:
	nombre = input ("Ingrese su Nombre: \n")
	nota1 = int (input("Ingrese su priemer nota1: \n"))
	nota2 = int (input("Ingrese su segunda nota2: \n"))
	nota3 = int (input("Ingrese su tercer nota3: \n"))
	suma = int (nota1 + nota2 + nota3)
	promedio =(suma/3)
	cadena = "{0}{1}\t\t\t{2}\t\t\t\t\t{3}\t\t\t\t\t\t{4}\t\t\t\t\t{5}\t\n".format(cadena, nombre, int (nota1), int (nota2), int(nota3), float (promedio))

	contador = contador + 1

	
	
	
print(cadena)
