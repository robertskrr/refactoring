package ejercicio01;

public class AppTerminal {

	public static void main(String[] args) {
		
		Terminal a = new Terminal("678112233", "rata");
		Terminal b = new Terminal("644744469", "mono");
		Terminal c = new Terminal("622328909", "bisonte");

		a.llama(b, 320);
		a.llama(c, 200);
		b.llama(c, -550); 

		System.out.println("Estado del terminal A:");
		System.out.println(a.toString());
		System.out.println("Estado del terminal B:");
		System.out.println(b.toString());
		System.out.println("Estado del terminal C:");
		System.out.println(c.toString());

		c.llama(a, 0);
		System.out.println("Finalizado.");

	}

}
