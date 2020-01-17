package Practica2;
public class ejercicio6 {
	public void marcoFijo() {
		//Crear una matriz 8x6 y que el marco sean 1
		int[][] tabla=new int[8][6];
		int i,k;
		System.out.println("Crear una matriz 8x6 y que el marco sean 1");
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
	}
}
