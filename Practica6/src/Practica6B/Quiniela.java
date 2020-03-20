package Practica6B;
public class Quiniela extends Apuesta{
	//ATRIBUTOS
	private int [] resultados=new int[15];
	private int aciertos;
	
	
	//COSNTRUCTORES
	public Quiniela(String nombre, String apellido1, String apellido2, int[] resultados) {
		super(nombre,apellido1,apellido2);
		this.setResultados(resultados);
		this.setAciertos(0);
	}
	
	public Quiniela() {
		
	}
	
	
	//SETTER Y GETTERS
	public int[] getResultados() {
		return resultados;
	}
	
	public void setResultados(int[] resultados) {
		this.resultados = resultados;
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
		for (i=0; i<this.getResultados().length; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Aciertos: "+this.getAciertos());
	}
}
