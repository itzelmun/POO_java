package todo;

public class Gerente extends Empleado{

	private double presupuesto;
	

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "presupuesto=" + presupuesto + super.toString();
	}

	public Gerente(String nombre, String apellido, int numeroFiscal, String direccion, double remuneracion,
			int empleadoId, double presupuesto) {
		super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
		this.presupuesto = presupuesto;
	}

	
	
}
