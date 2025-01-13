package ejercicio05;

import java.util.Scanner;

public class AppFrontera {
	private static Frontera[] personaFront = new Frontera[1000];
	private static int contFrontera = 0;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;

		do {
			System.out.println("--APP FRONTERIZA--");
			System.out.println("1. Registro paso de frontera.");
			System.out.println("2. Mostrar el número de personas que han pasado.");
			System.out.println("3. Búsqueda por nombre.");
			System.out.println("4. Búsqueda por DNI.");
			System.out.println("5. Salir.");
			opcion = sc.nextInt();
			sc.nextLine(); // Limpiar búffer

			if (opcion == 1) {
				registroPersona();
			} else if (opcion == 2) {
				mostrarNumPersonas();
			} else if (opcion == 3) {
				buscaNombre();
			} else if (opcion == 4) {
				buscaDNI();
			} else if (opcion == 5) {
				System.out.println("PROGRAMA FINALIZADO");
			} else {
				System.out.println("ERROR. Introduce una opción correcta por favor.");
			}
			
		} while (opcion != 5);

		sc.close();
	}

	// Método para registro de personas
	public static void registroPersona() {
		if (contFrontera >= 1000) {
			System.out.println("Se ha superado el límite de registros.");
			return;
		}

		System.out.print("Introduce el nombre completo: ");
		String nombre = sc.nextLine();
		System.out.print("Introuce el DNI: ");
		String dni = sc.nextLine();

		personaFront[contFrontera] = new Frontera(dni, nombre);
		System.out.println(personaFront[contFrontera].getNombreCompl() + " se ha registrado con éxito.");
		contFrontera++;
	}

	// Método para mostrar cuántas personas han pasado la frontera
	public static void mostrarNumPersonas() {
		if (contFrontera > 0) {
			System.out.println("Han pasado la frontera: " + contFrontera);
		} else if (contFrontera < 0) {
			System.out.println("Nadie ha pasado la frontera aún.");
		}
	}

	// Método para búsqueda por nombre (imprime todas las coincidencias)
	public static void buscaNombre() {
		System.out.print("Introduzca el nombre a buscar: ");
		String nombreBusca = sc.nextLine();
		for (int i = 0; i < contFrontera; i++) {
			if (nombreBusca.equalsIgnoreCase(personaFront[i].getNombreCompl())) {
				System.out.println(personaFront[i].toString());
			}
		}
	}

	// Método para búsqueda con DNI
	public static void buscaDNI() {
		System.out.print("Introduzca el DNI a buscar: ");
		String dniBusca = sc.nextLine();
		for (int i = 0; i < contFrontera; i++) {
			if (dniBusca.equalsIgnoreCase(personaFront[i].getDni())) {
				System.out.println("DNI ENCONTRADO:");
				System.out.println(personaFront[i].toString());
				return;
			}
		}
		System.out.println("No se ha encontrado ninguna persona con ese DNI.");
	}

}
