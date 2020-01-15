package Practica2;
import java.util.Scanner;
public class ejercicio3 {
	public void simetrica() {
		Scanner input=new Scanner(System.in);
		System.out.println("Crear una tabla 4x4 y decir si es simetrica(cambiar filas por columnas");
		int[][] tabla=new int[4][4];
		int i,k;
		for (i=0; i<tabla.length; i++) {
			System.out.println("Intoduce 4 valores: ");
			for (k=0; k<tabla.length; k++) {
				System.out.println("Rellenando tabla["+i+"]["+k+"]...");
				int num=input.nextInt();
				tabla[i][k]=num;
			}
		}
		boolean verify=true;
		int contar=0;
		while(contar<tabla.length && verify==true) {
			for (i=0; i<tabla.length; i++) {
				if (tabla[contar][i]!=tabla[i][contar]) {
					verify=false;
				}
			}
			contar++;
		}
		if (verify==true) {
			System.out.println("La tabla es simétrica");
		} else {
			System.out.println("La tabla no es simétrica");
		}
		input.close();
	}
}
