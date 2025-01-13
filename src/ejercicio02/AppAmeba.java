package ejercicio02;

public class AppAmeba {

	public static void main(String[] args) {

		Ameba ameba = new Ameba();
		Ameba amebaa = new Ameba();

		// Probamos las comidas de amebas (comida normal y otras amebas)
		System.out.println("Ameba1: " + ameba.toString());
		System.out.println("Ameba2: " + amebaa.toString());

		System.out.println("Ameba 1 come 10mg");
		ameba.comer(10);
		System.out.println("Ameba1 tras comer: " + ameba);

		System.out.println("Ameba2 se come a ameba1");
		amebaa.comer(ameba);
		System.out.println("Ameba2 tras comerse a ameba1: " + amebaa.toString());
		System.out.println("Ameba1 tras ser comida: " + ameba.toString());

		System.out.println("Ameba1 come 20mg para volver a ser fuerte: ");
		ameba.comer(20);
		System.out.println("Ameba1 tras comer 20mg: " + ameba);
	}

}
