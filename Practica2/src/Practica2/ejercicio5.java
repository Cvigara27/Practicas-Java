package Practica2;
public class ejercicio5 {
	public void crearDiagonal() {
		int[][] tabla=new int[7][7];
		int i,k;
		System.out.println("Crear una tabla 7x7, que la diagonal sea 1 y el resto 0");
		int contar=0;
		for (i=0; i<tabla.length; i++) {
			for (k=0; k<tabla.length; k++) {
				if (contar==k) {
					tabla[i][k]=1;
				} else {
					tabla[i][k]=0;
				}
			}
			contar++;
		}
		for (i=0; i<tabla.length; i++) {
			System.out.println();
			for (k=0; k<tabla[i].length; k++) {
				System.out.print(tabla[i][k]+" ");
			}
		}
	}
}
