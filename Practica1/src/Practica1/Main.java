package Practica1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ejercicio1 ej1=new ejercicio1(); ejercicio2 ej2=new ejercicio2();
		ejercicio3 ej3=new ejercicio3(); ejercicio4 ej4=new ejercicio4();
		ejercicio5 ej5=new ejercicio5(); ejercicio6 ej6=new ejercicio6();
		Scanner input=new Scanner(System.in);
		int i;
		for (i=0; i<6; i++) {
			System.out.println("Practica "+(i+1));
		}
		System.out.print("Que practica quieres ver? ");
		int opcion=Integer.parseInt(input.nextLine());
		switch(opcion) {
			case 1: ej1.leer(); break;
			case 2: ej2.leerInverso(); break;
			case 3: ej3.medias(); break;
			case 4: ej4.saltear(); break;
			case 5: ej5.mezclar(); break;
			case 6: ej6.alternar(); break;	
		}
		input.close();
	}
}
