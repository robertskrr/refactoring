package ejercicio04;

import ejercicio04.Pizza.Tamaño;
import ejercicio04.Pizza.Tipo;

public class AppPizza {

	public static void main(String[] args) {

		Pizza pizza = new Pizza(Tamaño.MEDIANA, Tipo.MARGARITA);
		Pizza pizzaa = new Pizza(Tamaño.FAMILIAR, Tipo.CUATRO_QUESOS);
		Pizza pizza3 = new Pizza(Tamaño.MEDIANA, Tipo.FUNGI);

		// Mostramos número de pizzas servidas y pedidas
		System.out.println("PEDIMOS 3 PIZZAS: ");
		System.out.println("Pizzas pedidas: " + Pizza.getTotalPedidas());
		System.out.println("Pizzas servidas: " + Pizza.getTotalServidas());

		// Servimos una pizza
		pizza.servir();

		// Volvemos a mostrar número de pizzas servidas y pedidas
		System.out.println("DESPUÉS DE SERVIR UNA PIZZA: ");
		System.out.println("Pizzas pedidas: " + (Pizza.getTotalPedidas()));
		System.out.println("Pizzas servidas: " + (Pizza.getTotalServidas()));

		// Mostramos las pizzas
		System.out.println("PIZZAS: ");
		System.out.println(pizza.toString() + " ");
		System.out.println(pizzaa.toString() + " ");
		System.out.println(pizza3.toString());
	}

}
