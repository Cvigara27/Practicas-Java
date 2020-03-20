package Practica6;
import java.util.Scanner;
public class RangoNoValidoException extends Exception {
	public RangoNoValidoException() {
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println("El numero debe ser superior a 0");
		System.out.println();
		System.out.print("¿Quieres dejar una nota para una posible mejora del programa? [Y/N] ");
		String eleccion=input.nextLine().toUpperCase();
		if(eleccion.equals("Y")) {
			System.out.println("¿Cuál es tu sugerencia?");
			String idea=input.nextLine();
			System.out.println("Gracias por tu idea:");
			System.out.println(idea);
		}
	}
}
