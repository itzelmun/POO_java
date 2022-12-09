package todo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cli = new Cliente ("Itzel", "Munguia",12 , "pino suarez", 1);
		Persona per = new Persona ("Guadalupe", "Sanchez", 15, "Camino mexicano");
		Empleado emp = new Empleado ("Itzel", "Munguia", 12, "Pino Suarez", 500, 1);
		Gerente ger = new Gerente ("Guadalupe", "Sanchez", 15, "Camino mexicano", 200, 1, 500);
		ger.aumentaRemuneracion(10);
		
		
		System.out.println(cli);
		System.out.println(per);
		System.out.println(emp);
		System.out.println(ger);
	}

	
	
}
