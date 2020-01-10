package Practica1;
import java.util.Scanner;
public class ejercicio6 {
	public void alternar() {
		Scanner input=new Scanner(System.in);
		int i;
		int[] serie1=new int[12];
		int[] serie2=new int[12];
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
			System.out.println(serie1[i]+" "+serie1[i+1]+" "+serie1[i+2]);
			System.out.println(serie2[i]+" "+serie2[i+1]+" "+serie2[i+2]);
		}
		input.close();
	}
}
