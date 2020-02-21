package Practica5;
final public class Comercial extends Empleado{
	private int ventasRealizadas;
	private float comision;
	
	public Comercial(String nombre, String apellido1, String apellido2, String nif, String edad, float salario, int ventasRealizadas, float comision) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.setVentasRealizadas(ventasRealizadas);
		this.setComision(comision);
	}
	
	public int getVentasRealizadas() {
		return ventasRealizadas;
	}
	public void setVentasRealizadas(int ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}
	public float getComision() {
		return comision;
	}
	public void setComision(float comision) {
		this.comision = comision;
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: "+this.getNombre()+"   NIF: "+this.getNif());
		System.out.println("Apellidos: "+this.getApellido1()+" "+this.getApellido2());
		System.out.println("Edad: "+this.getEdad()+"   Salario: "+this.getSalario());
	}
}
