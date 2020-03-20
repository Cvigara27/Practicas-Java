package Practica6;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean menu=true;
		while(menu==true) {
			System.out.println("=======================================");
			System.out.println("| CALCULADORA DE SUPERFICIE Y VOLUMEN |");
			System.out.println("=======================================");
			System.out.println("|                                     |");
			System.out.println("|  1) Dodecaedro      2) Esfera       |");
			System.out.println("|  3) Octaedro        4) Icosaedro    |");
			System.out.println("|             5) Salir                |");
			System.out.println("|                                     |");
			System.out.println("=======================================");
			System.out.print("¿Qué opción desesas? ");
			int opcion=Integer.parseInt(input.nextLine());
			switch(opcion){
				case 1:
					try {
						Dodecaedro figura=new Dodecaedro(pedirInformacion(" una arista "));
						figura.calcularArea();
						figura.calcularVolumen();
					}catch(NumberFormatException e) {
						System.out.println();
						System.out.println("Lo introducido no es un numero valido");
						System.out.println();
					}catch(RangoNoValidoException e) {
						e.printStackTrace();
						System.out.println();
					}
					break;
				case 2:
					try {
						Esfera figura2=new Esfera(pedirInformacion("l radio "));
						figura2.calcularArea();
						figura2.calcularVolumen();
					}catch(NumberFormatException e) {
						System.out.println();
						System.out.println("Lo introducido no es un numero valido");
						System.out.println();
					}catch(RangoNoValidoException e) {
						System.out.print("¿Quieres dejar una nota para una posible mejora del programa? [Y/N] ");
						e.printStackTrace();
					}
					break;
				case 3: 
					try {
						Octaedro figura3=new Octaedro(pedirInformacion(" una arista "));
						figura3.calcularArea();
						figura3.calcularVolumen();
					}catch(NumberFormatException e) {
						System.out.println();
						System.out.println("Lo introducido no es un numero valido");
						System.out.println();
					}catch(RangoNoValidoException e) {
						System.out.print("¿Quieres dejar una nota para una posible mejora del programa? [Y/N] ");
						e.printStackTrace();
					}
					break;
				case 4:
					try {
						Icosaedro figura4=new Icosaedro(pedirInformacion(" una arista "));
						figura4.calcularArea();
						figura4.calcularVolumen();
					}catch(NumberFormatException e) {
						System.out.println();
						System.out.println("Lo introducido no es un numero valido");
						System.out.println();
					}catch(RangoNoValidoException e) {
						System.out.print("¿Quieres dejar una nota para una posible mejora del programa? [Y/N] ");
						e.printStackTrace();
					}
					break;
				case 5:
					menu=false;
					break;
				default:
					System.out.println("¡ERROR! Opción no valida");
			}
		}
	}
	
	public static double pedirInformacion(String cosa) throws RangoNoValidoException {
		Scanner input=new Scanner(System.in);
		System.out.print ("Introduce el valor de"+cosa);
		double variable=Double.parseDouble(input.nextLine());
		if (variable<=0) {
			throw new RangoNoValidoException();
		}
		return variable;
	}
}
