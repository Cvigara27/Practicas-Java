package Practica6B;
import java.util.Arrays;
import java.util.Scanner;
public class Primitiva extends Apuesta {
	//ATRIBUTOS
	private int[] listaNum=new int[6];
	private int aciertos;
	
	
	//CONSTRUCTORES
	public Primitiva(String nombre, String apellido1, String apellido2) {
		super(nombre,apellido1,apellido2);
		this.setAciertos(0);
	}
	
	public Primitiva() {	
	}
	
	public Primitiva(Primitiva p1) {
		super(p1.nombre,p1.apellido1,p1.apellido2);
	}
	
	
	//SETTER Y GETTERS
	public int[] getListaNum() {
		return listaNum;
	}

	public void setListaNum(int[] listaNum) {
		this.listaNum = listaNum;
	}

	public int getAciertos() {
		return aciertos;
	}

	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}
	
	
	//METODOS
	public void mostrarApuesta() {
		System.out.println("Nombre: "+this.getNombre()+"   Nº Apuesta: "+this.getNumApuesta());
		System.out.println("Apellidos: "+this.getApellido1()+" "+this.getApellido2());
		System.out.print("Numeros de Primitiva: ");
		int i;
		for (i=0; i<this.getListaNum().length; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Aciertos: "+this.getAciertos());
	}
	
	public void crearApuestaPrimitiva() {
		Scanner input=new Scanner(System.in);
		System.out.print("¿Quieres introducir los números manualmente?[Y/N] ");
		String opcion=input.nextLine().toUpperCase();
		if(opcion.equals("Y")) {
			for(int i=0; i<6 ;i++) {
				System.out.print("Introduzca el numero en la posicion "+i+": ");
				int numPrimitiva=Integer.parseInt(input.nextLine());
				while(numPrimitiva>49 || numPrimitiva<1) {
					System.out.println("Los números deben ser entre 1 y 49");
					System.out.print("Introduzca el numero en la posicion "+i+": ");
					numPrimitiva=Integer.parseInt(input.nextLine());
				}
				while(Arrays.asList(this.listaNum).contains(numPrimitiva)) {
					System.out.println("Ese numero ya ha sido introducido");
					System.out.print("Introduzca el numero en la posicion "+i+": ");
					numPrimitiva=Integer.parseInt(input.nextLine());
				}
				this.listaNum[i]=numPrimitiva;
			}
		} else {
			for(int i=0; i<6 ;i++) {
				int numPrimitiva=(int)(Math.random()*((49-1)+1)+1);
				while(Arrays.asList(this.listaNum).contains(numPrimitiva)) {
					numPrimitiva=(int)(Math.random()*((49-1)+1)+1);
				}
				this.listaNum[i]=numPrimitiva;
			}
		}
	}
}
