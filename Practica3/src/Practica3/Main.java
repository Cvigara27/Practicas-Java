package Practica3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		boolean menu=true;
		Cuenta c1=new Cuenta();
		Cuenta c2=new Cuenta();
		System.out.println("Primero hay que crear las cuentas");
		c1.crearCuenta();
		System.out.println();
		System.out.println("Esta es la segunda cuenta");
		c2.crearCuenta();
		System.out.println();
		public void menu() {
			while(menu==true) {
				Scanner input=new Scanner(System.in);
				System.out.println("---------- Cajero Automatico ----------");
				System.out.println("|                                     |");
				System.out.println("|   1) Ingresar dinero                |");
				System.out.println("|   2) Retirar dinero                 |");
				System.out.println("|   3) Realizar una trasnferencia     |");
				System.out.println("|   4) Salir                          |");
				System.out.println("|                                     |");
				System.out.println("---------------------------------------");
				System.out.println();
				System.out.print("Que operación deseas hacer? ");
				int opcion=input.nextInt();
				switch(opcion) {
					case 1:
						
				}
			}
		}
}
}
