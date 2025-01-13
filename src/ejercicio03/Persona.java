package ejercicio03;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	// CONSTANTES
	private static final int PESOBAJO = -1;
	private static final int PESOIDEAL = 0;
	private static final int SOBREPESO = 1;

	// Constructor por defecto
	public Persona() {
		this.nombre = null;
		this.dni = generaDNI();
		this.sexo = 'H';
	}

	// Constructor con nombre, edad y sexo
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = comprobarSexo(sexo);
		peso=0;
		altura=0;
	}

	// Constructor con todos los parámetros
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	// Método calcularIMC
	public int calcularIMC() {
		double imc = peso / (Math.pow(altura, 2));
		if (imc < 20) {
			return PESOBAJO;
		} else if (imc >= 20 && imc <= 25) {
			return PESOIDEAL;
		} else {
			return SOBREPESO;
		}
	}

	// Método esMayorDeEdad
	public boolean esMayorDeEdad() {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	// Método privado comprobarSexo
	private char comprobarSexo(char sexo) {
		if (sexo == 'H' || sexo == 'M') {
			return sexo;
		} else {
			return 'H';
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	// Método privado para generar DNI
	private String generaDNI() {
		String numDNI = String.valueOf((int) (10000000 + Math.random() * 90000000));
		String letraDNI = Character.toString((char) ('A' + Math.random() * (('Z'-'A') + 1)));
		String dni = numDNI.concat(letraDNI);
		return dni;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
}
