
public class Repuesto {
	//Atributos
	private int codigo;
	private String marca;
	private String descripcion;
	private float precio;
	private TipoDeRepuesto repuesto;
	
	//Constructor
	public Repuesto() {
		this.codigo = codigo;
		this.marca = marca;
		this.descripcion = descripcion;
		this.precio = precio;
		this.repuesto = repuesto;
	}
	//Getters & Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public TipoDeRepuesto getRepuesto() {
		return repuesto;
	}
	public void setRepuesto(TipoDeRepuesto repuesto) {
		this.repuesto = repuesto;
	}
	@Override
	public String toString() {
		return "Repuesto [codigo=" + codigo + ", marca=" + marca + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", repuesto=" + repuesto + "]";
	}
}
