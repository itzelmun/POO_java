package todo;

public class Persona {

	private String nombre;
	private String apellido;
	private int numeroFiscal;
	private String direccion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumeroFiscal() {
		return numeroFiscal;
	}
	public void setNumeroFiscal(int numeroFiscal) {
		this.numeroFiscal = numeroFiscal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", numeroFiscal=" + numeroFiscal
				+ ", direccion=" + direccion ;
	}
	public Persona(String nombre, String apellido, int numeroFiscal, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroFiscal = numeroFiscal;
		this.direccion = direccion;
	}
	
	
}
