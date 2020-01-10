package Practica1;
import java.util.Scanner;
public class ejercicio5 {
	public void mezclar() {
		Scanner input=new Scanner(System.in);
		int i;
		int[] serie1=new int[10];
		int[] serie2=new int[10];
		System.out.println("Leer dos series de numeros devolverlas en orden:1A,1B,2A,2B...");
		for (i=0; i<serie1.length; i++) {
			System.out.print("Primera serie, escribe un número: ");
			int numero=input.nextInt();
			serie1[i]=numero;
		}
		for (i=0; i<serie2.length; i++) {
			System.out.print("Segunda serie, escribe un número: ");
			int numero=input.nextInt();
			serie2[i]=numero;
		}
		for (i=0; i<serie1.length; i++) {
			System.out.println(serie1[i]+" "+serie2[i]);
		}
		input.close();
	}
}
