package Practica6B;
import java.util.ArrayList;
import java.util.Scanner;
public class SimulacionLoteria {
	public static void main(String[] args) {
		ArrayList <Apuesta> loterias=new ArrayList<Apuesta>();
		Scanner input=new Scanner(System.in);
		boolean menu=true;
		while(menu==true) {
			System.out.println("===================================");
			System.out.println("|         L O T E R I A           |");
			System.out.println("===================================");
			System.out.println("|                                 |");
			System.out.println("|  1) Crear apuesta Primitiva     |");
			System.out.println("|  2) Crear apuesta Quiniela      |");
			System.out.println("|  3) Realizar simulación         |");
			System.out.println("|                                 |");
			System.out.println("|  4) Salir                       |");
			System.out.println("|                                 |");
			System.out.println("===================================");
			System.out.print("¿Qué opción desesas? ");
			int opcion=Integer.parseInt(input.nextLine());
			switch(opcion){
				case 1:
					System.out.print("Introduzca su nombre: ");
					String nombre=input.nextLine();
					System.out.print("Introduzca su primer apellido: ");
					String apellido1=input.nextLine();
					System.out.print("Introduzca su segundo apellido: ");
					String apellido2=input.nextLine();
					Primitiva loteria=new Primitiva(nombre,apellido1,apellido2);
					System.out.print("¿Cuántas primitivas quieres generar? ");
					int cantidad=Integer.parseInt(input.nextLine());
					int i;
					for(i=0; i<cantidad; i++) {
						if(i!=0) {
							loteria=new Primitiva(loteria);
						}
						loteria.crearApuestaPrimitiva();
						loterias.add(loteria);
						loteria.mostrarApuesta();
					}
			}
		}
	}
}
