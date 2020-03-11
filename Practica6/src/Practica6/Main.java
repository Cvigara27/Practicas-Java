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
			System.out.println("|  1) Dodecaedro      2) Romboedro    |");
			System.out.println("|                                     |");
			System.out.println("=======================================");
			int opcion=Integer.parseInt(input.nextLine());
			switch(opcion){
				case 1:
					System.out.print("Introduce el valor de una de las aristas(cm): ");
					double arista=Double.parseDouble(input.nextLine());
					Dodecaedro figura=new Dodecaedro(arista);
					figura.calcularArea();
					figura.calcularVolumen();
					break;
			}
		}
	}
}
