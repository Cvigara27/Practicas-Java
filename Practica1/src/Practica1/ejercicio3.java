package Practica1;
import java.util.Scanner;
public class ejercicio3 {
	public void medias(){
		Scanner input=new Scanner(System.in);
		int i;
		int mediapos=0,contarpos=0,medianeg=0,contarneg=0,contarc=0;
		System.out.println("Hacer media positivos,negativos y contar ceros");
		for (i=0; i<5; i++) {
			System.out.print("Introduzca un número: ");
			int numero=input.nextInt();
			if (numero<0) {
				medianeg+=numero;
				contarneg++;
			} else if (numero>0) {
				mediapos+=numero;
				contarpos++;
			} else {
				contarc++;
			}
		}
		if (mediapos==0) {
			System.out.println("Media positiva: 0");
		} else {
			System.out.println("Media positiva: "+mediapos/contarpos);
		}
		if (medianeg==0) {
			System.out.println("Media negativa: 0");
		} else {
			System.out.println("Media negativa: "+medianeg/contarneg);
		}
		System.out.println("Hay "+contarc+" ceros");
		input.close();
	}	
}