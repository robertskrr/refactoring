package ejercicio05;

public class Frontera {
	private String dni;
	private String nombreCompl;

	// Constructor
	public Frontera(String dni, String nombreCompl) {
		this.dni = dni;
		this.nombreCompl = nombreCompl;
	}

	// Getters y setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompl() {
		return nombreCompl;
	}

	public void setNombreCompl(String nombreCompl) {
		this.nombreCompl = nombreCompl;
	}

	@Override
	public String toString() {
		return "DNI: " + dni + " -- Nombre completo: " + nombreCompl;
	}

}
