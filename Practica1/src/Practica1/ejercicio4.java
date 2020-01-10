package Practica1;
import java.util.Scanner;
public class ejercicio4 {
	public void saltear() {
		Scanner input=new Scanner(System.in);
		int i;
		int[] numeros=new int[10];
		for (i=0; i<numeros.length; i++) {
			System.out.print("Introduzca un número: ");
			int numero=input.nextInt();
			numeros[i]=numero;
		}
		int contar=1;
		for (i=0; i<5; i++) {
			System.out.print(numeros[i]+" ");
			System.out.print(numeros[(numeros.length-contar)]+" ");
			contar++;
		}
		input.close();
	}
}
