package Practica5;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList <Empleado> trabajadores=new ArrayList <Empleado>();
		boolean menu=true;
		Empleado señor=new Empleado();
		Comercial comercial=new Comercial();
		Repartidor repartidor=new Repartidor();
		while(menu==true) {
			System.out.println();
			System.out.println("============================");
			System.out.println("|           M E N U        |");
			System.out.println("============================");
			System.out.println("|                          |");
			System.out.println("|  1) Dar alta empleado    |");
			System.out.println("|  2) Dar alta comercial   |");
			System.out.println("|  3) Dar alta repartidor  |");
			System.out.println("|  4) Mostrar empleados    |");
			System.out.println("|  5) Mostrar comerciales  |");
			System.out.println("|  6) Mostrar reaprtidores |");
			System.out.println("|  7) Salir                |");
			System.out.println("|                          |");
			System.out.println("============================");
			System.out.print("¿Qué opción deseas? ");
			int opcion=Integer.parseInt(input.nextLine());
			switch(opcion) {
				case 1:
					señor.pedirAlta(trabajadores);
					break;
				case 2:
					comercial.pedirAlta(trabajadores);
					break;
				case 3:
					repartidor.pedirAlta(trabajadores);
					break;
				case 4:
					señor.mostrarAtributos(trabajadores);
					break;
				case 5:
					comercial.mostrarAtributos(trabajadores);
					break;
				case 6:
					repartidor.mostrarAtributos(trabajadores);
					break;
				case 7:
					menu=false;
					break;
				default:
					System.out.println("¡ERROR! Opción no valida");
			}
		}
	}
}
