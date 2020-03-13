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
					double arista=pedirInformacion(" una arista ");
					Dodecaedro figura=new Dodecaedro(arista);
					figura.calcularArea();
					figura.calcularVolumen();
					break;
				case 2:
					double radio=pedirInformacion("l radio ");
					Esfera figura2=new Esfera(radio);
					figura2.calcularArea();
					figura2.calcularVolumen();
					break;
				case 3: 
					double arista2=pedirInformacion(" una arista ");
					Octaedro figura3=new Octaedro(arista2);
					figura3.calcularArea();
					figura3.calcularVolumen();
					break;
				case 5:
					menu=false;
					break;
				default:
					System.out.println("¡ERROR! Opción no valida");
			}
		}
	}
	
	public static double pedirInformacion(String cosa) {
		Scanner input=new Scanner(System.in);
		System.out.print ("Introduce el valor de"+cosa);
		double variable=Double.parseDouble(input.nextLine());
		return variable;
	}
}
