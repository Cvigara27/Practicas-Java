package Practica1;
import java.util.Scanner;
public class ejercicio2 {
	public void leerInverso(){
		//Leer numeros y devolver en orden inverso
		Scanner input=new Scanner(System.in);
		int i;
		int[] numeros=new int[5];
		System.out.println("Leer numeros y devolver en orden inverso");
		for (i=0; i<numeros.length; i++) {
			System.out.print("Introduzca un número: ");
			int numero=input.nextInt();
			numeros[i]=numero;
		}
		for (i=4; i>=0; i--) {
			System.out.print(numeros[i]+" ");
		}
		input.close();
	}
}