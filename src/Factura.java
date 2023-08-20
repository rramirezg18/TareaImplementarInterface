
public class Factura {
	//Atributos
	private String serie;
	private int numero;
	private String facha;
	private Cliente cliente;
	//Constructor
	public Factura() {
		this.serie = serie;
		this.numero = numero;
		this.facha = facha;
		this.cliente = cliente;
	}
	//Getters & Setters
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFacha() {
		return facha;
	}
	public void setFacha(String facha) {
		this.facha = facha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente() {
		this.cliente = cliente;
	}
	
	
}
