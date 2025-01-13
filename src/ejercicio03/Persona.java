package ejercicio03;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    // Constantes de IMC
    private static final int PESO_BAJO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBRE_PESO = 1;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.dni = generarDNI();
        this.sexo = 'H';
    }

    // Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = validarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    // Constructor con todos los parámetros
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = validarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Calcula el IMC de la persona y devuelve su categoría.
     * @return Constante que representa peso bajo, ideal o sobrepeso.
     */
    public int calcularIMC() {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que 0.");
        }

        double imc = peso / (Math.pow(altura, 2));
        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBRE_PESO;
        }
    }

    /**
     * Verifica si la persona es mayor de edad.
     * @return true si la edad es mayor o igual a 18, false en caso contrario.
     */
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    /**
     * Valida el sexo proporcionado.
     * @param sexo Caracter que representa el sexo.
     * @return 'H' para hombre, 'M' para mujer, o 'H' por defecto.
     */
    private char validarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : 'H';
    }

    @Override
    public String toString() {
        return String.format("Persona [nombre=%s, edad=%d, dni=%s, sexo=%c, peso=%.2f, altura=%.2f]",
                nombre, edad, dni, sexo, peso, altura);
    }

    /**
     * Genera un DNI aleatorio.
     * @return String que representa un DNI.
     */
    private String generarDNI() {
        String numDNI = String.valueOf((int) (10000000 + Math.random() * 90000000));
        char letraDNI = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        return numDNI + letraDNI;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = validarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
