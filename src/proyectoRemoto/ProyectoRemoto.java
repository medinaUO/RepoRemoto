package proyectoRemoto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProyectoRemoto {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in); 
		int valorEntradaTeclado = -1; 
		boolean salir = false; 

		// Mientras no se pulse la opcion de salir, ejecutar el programa
		while (!salir) 
		{
			// Mostrar el menu inicial
			System.out.println("\nElige el numero que quieras del 1 al 25 para mostrar el mensaje del alumno/a");
			System.out.println("0: Salir");

			try 
			{
				// Obtenemos el valor introducido por el usuario
				System.out.print("\nNumero: ");
				valorEntradaTeclado = entradaTeclado.nextInt();
				
				// Vamos a la opcion elegida por el usuario
				switch (valorEntradaTeclado) 
				{
					case 1:
						NoHayAlumno();
						break;
					case 2:
						NoHayAlumno();
						break;
					case 3:
						NoHayAlumno();
						break;
					case 4:
						NoHayAlumno();
						break;
					case 5:
						System.out.println("Raúl Bustelo Martínez");
						break;
					case 6:
						System.out.println("Salut, sunt Claudiu Ioan Emanuel Boieroiu48");
						break;
					case 7:
						System.out.println("Wismy: Feliz Navidad");
						break;
					case 8:
						NoHayAlumno();
						break;
					case 9:
						NoHayAlumno();
						break;
					case 10:
						NoHayAlumno();
						break;
					case 11:
						NoHayAlumno();
						break;
					case 12:
						NoHayAlumno();
						break;
					case 13:
						NoHayAlumno();
						break;
					case 14:
						NoHayAlumno();
						break;
					case 15:
						NoHayAlumno();
						break;
					case 16:
						NoHayAlumno();
						break;
					case 17:
						NoHayAlumno();
						break;
					case 18:
						NoHayAlumno();
						break;
					case 19:
						NoHayAlumno();
						break;
					case 20:
						NoHayAlumno();
						break;
					case 21:
						NoHayAlumno();
						break;
					case 22:
						NoHayAlumno();
						break;
					case 23:
						NoHayAlumno();
						break;
					case 24:
						System.out.println("Hola, soy Angel85 tambien");
						break;
					case 25:
						//Este seria un ejemplo
						System.out.println("Hola, soy Angel85");
						break;
						
						
					// Opcion 4. Salir del programa.	
					case 0:
						// Indicamos al usuario que va a salir del programa
						System.out.println("Has seleccionado la opcion Salir");
						System.out.println("Chao chao");
						
						// Asignamos el valor true a la variable "salir" para no volver a entrar en el bucle que muestra en menu
						salir = true;
						
						// Se cierra la entrada por teclado y se finaliza el programa
						entradaTeclado.close();
						System.exit(0);
						break;
					
					// Si se ha elegido una opcion distinta, se recuerda al usuario las opciones disonibles
					default:
						System.out.println("Introduce un numero del 1 al 25 para ver el mensaje del alumno/a o el 0 para salir.");
				}
				
			} catch (InputMismatchException e) 
			{
				System.out.println("Valor incorrecto. Debes insertar un numero\n");
				entradaTeclado.next();
			}
		}		

	}

	/**
	 * Este metodo se encarga de mostrar un mensaje indicando que la opcion no tiene asignada ningun alumno/a
	 * @return void
	*/
	public static void NoHayAlumno()
	{
		System.out.println("Esta opcion no tiene asignada nungun alumno/a");
	}	
	
}
