package ejercicio02;

public class Ameba {
	private int peso;

	public Ameba() {
		this.peso = 3;
	}

	public void comer(int comida) {
		if (comida > 0) {
			this.peso = this.peso + (comida - 1); // Incrementa su peso pero gasta 1mg en fagocitar
		} else if (comida < 0) {
			System.out.println("ERROR. Introduce un valor positivo por favor.");
		}
	}

	public void comer(Ameba ameba) {
		if (ameba.peso > 0) {
			this.peso = this.peso + (ameba.peso - (1));
			ameba.peso = 0;
		} else if (ameba.peso < 0) {
			System.out.println("La ameba que quiere comer no pesa nada :(");
		}
	}

	@Override
	public String toString() {
		return "Ameba [peso = " + peso + " microgramos]";
	}

}
