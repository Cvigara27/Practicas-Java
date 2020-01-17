package Practica2;
import java.util.Scanner;
public class ejercicio4 {
	public void tablaSumar() {
		//Tener 2 matrices de 3x3 y sumar los valores
		Scanner input=new Scanner(System.in);
		int[][] tabla1=new int[3][3];
		int[][] tabla2=new int[3][3];
		int[][] tabla3=new int[3][3];
		int i,k;
		System.out.println("Tener 2 matrices de 3x3 y sumar los valores");
		for (i=0; i<tabla1.length; i++) {
			for (k=0; k<tabla1[i].length; k++) {
				System.out.println("Rellenando tabla1["+i+"]["+k+"]...");
				int num=input.nextInt();
				tabla1[i][k]=num;
			}
		}
		for (i=0; i<tabla2.length; i++) {
			for (k=0; k<tabla2[i].length; k++) {
				System.out.println("Rellenando tabla2["+i+"]["+k+"]...");
				int num=input.nextInt();
				tabla2[i][k]=num;
			}
		}
		for (i=0; i<tabla2.length; i++) {
			for (k=0; k<tabla2[i].length; k++) {
				tabla3[i][k]=tabla1[i][k]+tabla2[i][k];
			}
		}
		for (i=0; i<tabla3.length; i++) {
			System.out.println();
			for (k=0; k<tabla3[i].length; k++) {
				System.out.print(tabla3[i][k]+" ");
			}
		}
		input.close();
	}
}
