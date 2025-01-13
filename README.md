# REFACTORING
## Ejercicio 1
Un movil tiene asociado un número. Los moviles se pueden llamar unos a otros y el tiempo de
conversación corre para ambos. Cada móvil lleva asociada una tarifa que puede ser “rata”, “mono”
o “bisonte”. El coste por minuto es de 6, 12 y 30 céntimos respectivamente. Se tarifican los
segundos exactos. Obviamente, cuando un móvil llama a otro, se le cobra al que llama, no al que
recibe la llamada.
A continuación se proporciona el contenido del main y el resultado que debe aparecer por
pantalla. Para que el total tarificado aparezca con dos decimales, puedes utilizar DecimalFormat.
Programa principal:
//creación de los móviles con su número y tarifa
Movil m1 = new Movil("678 11 22 33", "rata");
Movil m2 = new Movil("644 74 44 69", "mono");
Movil m3 = new Movil("622 32 89 09", "bisonte");
//hacemos las llamadas
m1.llama(m2, 320);
m1.llama(m3, 200);
m2.llama(m3, 550);
//mostramos los segundos de conversación y lo tarificado por cada movil
System.out.println(m1);
System.out.println(m2);
System.out.println(m3);
Salida:
Nº 678 11 22 33 - 520s de conversación - tarificados 0,52 euros
Nº 644 74 44 69 - 870s de conversación - tarificados 1,10 euros
Nº 622 32 89 09 - 750s de conversación - tarificados 0,00 euros
## Ejercicio 2
Las amebas son seres unicelulares de forma cambiante ya que carecen de pared celular.
Fagocitan cualquier cosa que se les pone por delante. Crea la clase Ameba con el atributo peso,
un número entero que indica los microgramos que pesa el bicho. Al tratarse de una unidad tan
pequeña, no se tienen en cuenta los decimales, será un dato entero.
Al crearse una ameba de la nada – new Ameba() – su peso es de 3 microgramos.
Al comer, va incrementando su peso; gasta un microgramo en el proceso de fagocitar y el resto
hace que aumente de peso.
Por ejemplo, si come una partícula de 6 microgramos – por ej. miAmeba.come(6) – engordaría 5
microgramos.
Una ameba se puede comer a otra ameba. En este caso, sucede lo mismo que anteriormente, se
gasta un microgramo en el proceso de fagocitado y el resto lo engorda la ameba que come.
Por ejemplo, si una ameba de 7 microgramos se come a una de 4, acaba pesando 10
microgramos.
La ameba comida no se destruye sino que se quedaría con un peso de 0 microgramos, una pena
de ameba vamos.
Posteriormente, una ameba comida podría recuperarse si ella misma come algo.
Nótese que el método come está sobrecargado.
Prueba las funcionalidades implementadas.
## Ejercicio 3
Haz una clase llamada Persona que siga las siguientes condiciones:
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que
se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también
su tipo. Si quieres añadir algún atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números,
cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
Se implantaran varios constructores:
● Un constructor por defecto.
● Un constructor con el nombre, edad y sexo, el resto por defecto.
● Un constructor con todos los atributos como parámetro.
Los métodos que se implementaran son:
● calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2 en m)), si
esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un
número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función
devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la
función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
● esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
● comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es
correcto, sera H. No sera visible al exterior.
● toString(): devuelve toda la información del objeto.
● generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su
letra correspondiente. Este método sera invocado cuando se construya el objeto. Puedes
dividir el método para que te sea más fácil. No será visible al exterior.
● Métodos set de cada parámetro, excepto de DNI.
## Ejercicio 4
Crea la clase Pizza con los atributos y métodos que consideres necesarios en base a las
siguientes especificaciones:
Sobre cada pizza se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida.
La clase debe almacenar información sobre el número total de pizzas que se han pedido y que se
han servido.
Siempre que se crea una pizza nueva, su estado es “pedida”.
Prueba las funcionalidades implementadas. Para ello, desde la App se debe poder pedir una
pizza, servir una pizza, mostrar el número de pizzas pedidas y mostrar el número de pizzas
servidas.
## Ejercicio 5
En un puesto fronterizo recogemos diariamente la información referente al tránsito de
personas. Diariamente sabemos que no se pueden superar las 1000 personas. Para una
persona nos interesa almacenar su DNI y nombre completo.
Se pide diseñar una aplicación que presente las siguientes opciones:
1. Registro paso de frontera.
2. Mostrar el número de personas que han pasado.
3. Búsqueda por nombre.
4. Búsqueda por DNI.
5. Salir.
Mediante la opción 1 se recogen los datos de la persona que transita a través de la frontera.
La opción 2 muestra el número de personas que han pasado por la frontera. Mediante la
opción 3 se solicita un nombre por teclado y se muestra la información de todas las persona
cuyo nombre coincide con el introducido. Y por último, en la opción 4 introducimos el DNI de
una persona de la que obtendremos toda su información.
