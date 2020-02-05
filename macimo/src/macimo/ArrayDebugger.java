package macimo;

import java.util.Scanner;

public class ArrayDebugger {

	public static void main(String[] args) {
		int[] myArray = new int[3];
        ArrayDebugger.getValues(myArray);
        System.out.println("El valor m�ximo en el array es: " + findMax(myArray));
    }

    public static void getValues(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Por favor, introduzca un n�mero");
            array[i] = scan.nextInt();
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}


