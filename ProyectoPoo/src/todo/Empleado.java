package todo;

public class Empleado extends Persona{

	private double remuneracion;
	private int empleadoId;
	


	public Empleado(String nombre, String apellido, int numeroFiscal, String direccion, double remuneracion,
			int empleadoId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		this.empleadoId = empleadoId;
	}



	public double getRemuneracion() {
		return remuneracion;
	}



	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}



	public int getEmpleadoId() {
		return empleadoId;
	}



	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	//se crea un método para acceder a la clase main
	public void aumentaRemuneracion(int porcentaje) {
		this.remuneracion = ((remuneracion / 100)*porcentaje )+ remuneracion;
	}

	@Override
	public String toString() {
		return "remuneracion=" + remuneracion + ", empleadoId=" + empleadoId + super.toString() ;
	}

	
	
	
}
