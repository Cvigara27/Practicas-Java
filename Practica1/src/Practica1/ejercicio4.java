package Practica1;
import java.util.Scanner;
public class ejercicio4 {
	public void saltear() {
		//Leer numeros y devolverlo en orden:1�,�ltimo,2�,Pen�ltimo...
		Scanner input=new Scanner(System.in);
		int i;
		int[] numeros=new int[10];
		System.out.println("Leer numeros y devolverlo en orden:1�,�ltimo,2�,Pen�ltimo...");
		for (i=0; i<numeros.length; i++) {
			System.out.print("Introduzca un n�mero: ");
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
