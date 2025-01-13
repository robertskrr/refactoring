package ejercicio04;

public class Pizza {
	// ENUM DE ATRIBUTOS
	enum Tamaño {
		MEDIANA, FAMILIAR
	}

	Tamaño tamaño; // Declaración del atributo

	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGI
	}

	Tipo tipo;

	enum Estado {
		PEDIDA, SERVIDA
	}

	Estado estado;

	// Para contar las pizzas pedidas y servidas
	private static int totalPedidas = 0;
	private static int totalServidas = 0;

	// Constructor, estado por defecto es PEDIDA
	public Pizza(Tamaño tamaño, Tipo tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = Estado.PEDIDA;
		totalPedidas++; // Se incrementa cada vez que se crea una pizza
	}

	public void servir() {
		// Si el estado de la pizza es PEDIDA la sirve
		if (this.estado == Estado.PEDIDA) {
			this.estado = Estado.SERVIDA;
			totalServidas++;
		} else if (this.estado != Estado.PEDIDA) {
			System.out.println("ERROR. Esta pizza ya está servida");
		}
	}

	public static int getTotalPedidas() {
		return totalPedidas;
	}

	public static int getTotalServidas() {
		return totalServidas;
	}

	@Override
	public String toString() {
		return "Pizza [tamaño=" + tamaño + ", tipo=" + tipo + ", estado=" + estado + "]";
	}

}
