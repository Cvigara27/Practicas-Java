package Practica2;
import java.util.Scanner;
public class ejercicio7 {
	public void marcoDinamico() {
		//Crear una matriz con dimensiones dadas por \nel usuario y que el marco sean 1
		Scanner input=new Scanner(System.in);
		System.out.println("Crear una matriz con dimensiones dadas por \nel usuario y que el marco sean 1");
		System.out.println("Introduzca el numero de columnas");
		int colum=input.nextInt();
		System.out.println("Introduzca el numero de filas");
		int filas=input.nextInt();
		int[][] tabla=new int[filas][colum];
		int i,k;
		int contar=0;
		for(i=0; i<tabla.length; i++) {
			for(k=0; k<tabla[i].length; k++) {
				if (contar==0 || contar==tabla.length-1) {
					tabla[i][k]=1;
				} else {
					if (k==0 || k==tabla[i].length-1) {
						tabla[i][k]=1;
					} else {
						tabla[i][k]=0;
					}
				}
			}
			contar++;
		}
		for (i=0; i<tabla.length; i++) {
			System.out.println();
			for (k=0; k<tabla[i].length; k++) {
				System.out.print(tabla[i][k]);
			}
		}
		input.close();
	}
}
