
public class Cliente {
	//Atributos
	private String nit;
	private String nombre;
	//Constructor
	public Cliente() {
		this.nit = nit;
		this.nombre = nombre;
	}
	//Getters & Setters
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [nit=" + nit + ", nombre=" + nombre + "]";
	}
}
