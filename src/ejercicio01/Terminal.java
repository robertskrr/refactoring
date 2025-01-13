package ejercicio01;

import java.text.DecimalFormat;

public class Terminal {

	private String numero_TERMINAL;
	private int timeConver;
	private String tarifa;
	private double totalTarificado;

	public Terminal(String numero, String tarifa) {
		this.numero_TERMINAL = numero;
		this.tarifa = tarifa;
	}

	// Función llama, afecta al tiempo del terminal que llama y al que llama
	public void llama(Terminal otroTerminal, int tiempo) {
		if (tiempo > 0) {
			this.timeConver = this.timeConver + tiempo;
			otroTerminal.timeConver = otroTerminal.timeConver + tiempo;

			// Calcular coste de llamada para el móvil que llama
			double costePorSeg = costeporSeg(tarifa);
			this.totalTarificado = this.totalTarificado + (tiempo * costePorSeg);
		} else if (tiempo < 0) {
			System.out.println("ERROR. No puede aplicar un valor negativo al tiempo de conversación");
		}
	}

	// Método para obtener coste por segundo
	private double costeporSeg(String tarifa) {
		double coste;

		if (tarifa.toLowerCase().equals("rata")) {
			coste = 0.06 / 60; // 6 cent por min
		} else if (tarifa.toLowerCase().equals("mono")) {
			coste = 0.12 / 60; // 12 cent por min
		} else if (tarifa.toLowerCase().equals("bisonte")) {
			coste = 0.30 / 60; // 30 cent por min
		} else {
			coste = 0;
		}

		return coste;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Nº " + numero_TERMINAL + " - " + timeConver + "s de conversación - tarificados "
				+ df.format(totalTarificado) + " euros";
	}

}
