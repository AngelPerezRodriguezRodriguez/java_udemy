import domain.Persona;

/*
 * La palabra 'final' tiene diferentes significados:
 * 
 * 1. Variables
 * Evita cambiar el valor que almacena la variable. 
 * 
 * Normalmente cuando trabajamos con variables se combina con el modificador 
 * de acceso 'static' para convertir una variable en una constante, no podremos
 * modificar su valor y vamos a poder acceder a dicha variable sin necesidad
 * de crear una instancia de la clase. Ej. en la clase 'Math' todos sus 
 * atributos y métodos son de tipo 'static' y 'final'.
 * 
 * 2. Métodos
 * Cuando estamos aplicando el concepto de herencia, evita que los métodos
 * en la clase hija modifiquen el comportamiento definido de un método
 * en la clase padre.
 * 
 * 3. Clases
 * Evita que creemos clase hijas de la clase que hemos definido como 'final'.
 */
public class TestFinal {

    public static void main(String[] args) throws Exception {

        final int variable01 = 10;

        System.out.println(variable01);

        // No puede cambiar su valor
        // variable01 = 5;

        System.out.println(Persona.MI_CONSTANTE);

        // No puede cambiar su valor
        // Persona.MI_CONSTANTE = 10;

        final Persona persona01 = new Persona();

        // No podemos cambiar la referencia en memoria
        // almacenada en la variable final de tipo 'Persona'
        // persona01 = new Persona();

        // Pero sí modificar el contenido del objeto
        // al cual está apuntando
        persona01.setNombre("Francisco");
        System.out.println(persona01.getNombre());
    }
}
