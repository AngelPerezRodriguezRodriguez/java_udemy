package test;

import mx.com.javaudemy.Utileria;

import static mx.com.javaudemy.Utileria.imprimir;

/*
 * Podemos hacer uso del método 'imprimir' de varias formas:
 * 
 * 1. Importamos la clase que contiene el método
 * 
 * 2. Si el método es estático, podemos importarlo directamente
 * 
 * 3. Usamos el nombre de dominio completamente calificado
 */

public class testUtileria {

    public static void main(String[] args) {

        // Primera forma
        Utileria.imprimir("1er mensaje");

        // Segunda forma
        imprimir("2do mensaje");

        // Tercera forma
        mx.com.javaudemy.Utileria.imprimir("3er mensaje");
    }
}
