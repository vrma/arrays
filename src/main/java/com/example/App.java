package com.example;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String marcaCoche1 = "Renault";
        String marcaCoche2 = "BMW";

        /*
         * ¿Que es un array? Es un identificador de variable (el nombre de una variable)
         * que hace referencia a una zona donde se pueden almacenar varios valores del
         * mismo
         * tipo.
         * Un array es de tamaño fijo, que no es lo mismo que inmutable. De tamaño
         * quiere decir
         * que una vez creado no se le pueden agregar mas elementos. Inmutable quiere
         * que no se
         * puede modificar ningun elemento.
         * Para acceder a los elementos del array hace falta un indice, que comienza por
         * el valor
         * cero (0)
         */

        // La declaracion de un array de String, es decir, un array donde cada elemento
        // es
        // de tipo String
        // String[] marcasDeCoche;

        // Array de numeros enteros
        int[] arrayDeEnteros;

        // Array de Persona
        // Persona[] personasArray;

        // ¿Como agregar elementos al array?
        // Rta. Hay dos formas de hacerlo manualmente
        // Una reservando memoria para la cantidad de elementos y Otra asignandolos
        // entra llaves separados por coma.

        // Comenzando por el array de enteros seria:
        // Variante # 1
        arrayDeEnteros = new int[5];

        arrayDeEnteros[0] = 10;
        arrayDeEnteros[1] = 20;
        arrayDeEnteros[2] = 25;
        arrayDeEnteros[3] = 31;
        arrayDeEnteros[4] = 46;

        // Variante # 2
        int[] arrayDeEnteros2 = { 1, 3, 5, 6, 7, 78, 100 };

        /*
         * Para inicializar el array de tipo String, marcas de coches en este caso,
         * se podria utilizar el operador new tambien, pero esta fuertemente
         * desaconsejado
         */
        String[] marcasDeCoche = { "Renaul", "Tesla", "Toyota", "Mercedez" };

        /* Creacion del array de Persona */

        Persona[] personasArray = {
                Persona.builder()
                        .nombre("Juan")
                        .primerApellido("Guerrero")
                        .segundoApellido("Leon")
                        .genero(Genero.HOMBRE)
                        .salario(3500.50)
                        .build(),
                Persona.builder().nombre("Ruben").genero(Genero.HOMBRE)
                        .salario(4000.45).build(),
                Persona.builder().nombre("Margarita").genero(Genero.MUJER)
                        .salario(2400.30).build(),
                Persona.builder().nombre("Susana").genero(Genero.MUJER)
                        .salario(3000.00).build()
        };

        /* Recorrer los arrays
         * 
         * Sentencias de control de flujo (if, switch case, for clasico, 
         * for mejorado (MAL LLAMADO FOR EACH), 
         * while, do while, break, continue, y los operadores de auto incremento
         * y auto decremento, ademas de los operadores logicos )
         */












    }
}
