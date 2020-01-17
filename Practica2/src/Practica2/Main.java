package Practica2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ejercicio2 ej2=new ejercicio2(); ejercicio3 ej3=new ejercicio3();
		ejercicio4 ej4=new ejercicio4(); ejercicio5 ej5=new ejercicio5();
		ejercicio6 ej6=new ejercicio6(); ejercicio7 ej7=new ejercicio7();
		Scanner input=new Scanner(System.in);
		int i;
		for (i=0; i<6; i++) {
			System.out.println("Practica "+(i+2));
		}
		System.out.print("Que practica quieres ver? ");
		int opcion=input.nextInt();
		switch(opcion) {
			case 2: ej2.tablaIncremento(); break;
			case 3: ej3.simetrica(); break;
			case 4: ej4.tablaSumar(); break;
			case 5: ej5.crearDiagonal(); break;
			case 6: ej6.marcoFijo(); break;
			case 7: ej7.marcoDinamico(); break;
		}
		input.close();
	}

}
