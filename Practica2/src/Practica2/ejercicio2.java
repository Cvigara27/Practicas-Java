package Practica2;
public class ejercicio2 {
	public void tablaIncremento() {
		//Crear un tabla 5x5 donde T[n][m]=n+m
		int[][] tabla=new int[5][5];
		int i,k;
		for(i=0; i<tabla.length; i++) {
			for(k=0; k<tabla[i].length; k++) {
				tabla[i][k]=i+k;
			}
		}
		for (i=0; i<tabla.length; i++) {
			System.out.println();
			for (k=0; k<tabla[i].length; k++) {
				System.out.print(tabla[i][k]+" ");
			}
		}
	}
}
