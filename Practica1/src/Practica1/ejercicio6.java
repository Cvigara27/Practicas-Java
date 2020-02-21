package Practica1;
import java.util.Scanner;
public class ejercicio6 {
	public void alternar() {
		//Leer dos series de numeros devolverlas en orden:1A,2A,3A,1B,2B,3B,4A...
		Scanner input=new Scanner(System.in);
		int i;
		int[] serie1=new int[12];
		int[] serie2=new int[12];
		int[] serie3=new int[24];
		for (i=0; i<serie1.length; i++) {
			System.out.print("Primera serie, escribe un número: ");
			int numero=Integer.parseInt(input.nextLine());
			serie1[i]=numero;
		}
		for (i=0; i<serie2.length; i++) {
			System.out.print("Segunda serie, escribe un número: ");
			int numero=Integer.parseInt(input.nextLine());
			serie2[i]=numero;
		}
		int contar=0,inc=0;
		while (inc<serie1.length) {
			for (i=0; i<3;i++) {
				serie3[contar]=serie1[i+inc];
				contar++;
			}
			for (i=0; i<3;i++) {
				serie3[contar]=serie2[i+inc];
				contar++;
			}
			inc+=3;
		}
		for (i=0;  i<serie3.length; i++) {
			System.out.print(serie3[i]+" ");
		}
		input.close();
	}
}
