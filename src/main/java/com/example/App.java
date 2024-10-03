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
                                                .salario(4500.30).build(),
                                Persona.builder().nombre("Susana").genero(Genero.MUJER)
                                                .salario(3000.00).build()
                };

                /*
                 * Recorrer los arrays
                 * 
                 * Sentencias de control de flujo (if, switch case, for clasico,
                 * for mejorado (MAL LLAMADO FOR EACH),
                 * while, do while, break, continue, y los operadores de auto incremento
                 * y auto decremento, ademas de los operadores logicos, operador ternario )
                 */

                /*
                 * Comenzando por el array de enteros:
                 * Mostrar los elementos que sean par
                 */

                // Utilizando la sentencia for clasica
                // El operador de autoincremento i++ => i = i + 1
                // La respuesta a la eterna pregunta de que es lo correcto
                // si ++i o i++, se responde facilmente, utilizando la herramienta
                // jshell

                int totalElementos = arrayDeEnteros.length;

                for (int i = 0; i <= totalElementos - 1; i++) {
                        if (arrayDeEnteros[i] % 2 == 0)
                                System.out.println(arrayDeEnteros[i]);
                }

                for (int i = 0; i <= totalElementos - 2;) {
                        if (arrayDeEnteros[i++] % 2 == 0)
                                System.out.println(arrayDeEnteros[i]);
                }

                // Enhanced for (for mejorado), se utiliza mas que el clasico
                // porque no tienes que declarar ninguna variable de control
                // la propia sentencia for se encarga de comprobar cuando se ha
                // llegado al final del array.
                // ¿Para que queda el for clasica? Para cuando necesitas utilizar el
                // indice. Ejemplo seria: Si necesitara mostrar los elementos que son
                // de indice par
                System.out.println("Recorriendo el array de numeros enteros con un for mejorado");
                for (int numero : arrayDeEnteros) {
                        if (numero % 2 == 0)
                                System.out.println(numero);
                }

                /*
                 * Ejemplo: Recorrer el array de personas y solo mostrar
                 * las personas que sean del genero MUJER y tengan un salario
                 * superior a la media.
                 */

                double salarioMedio = 0; // sumatoria de los salarios entre el total de personas
                double sumatoriaSalarios = 0;
                int totalPersonas = 0;

                for (Persona persona : personasArray) {
                        // sumatoriaSalarios = sumatoriaSalarios + persona.getSalario();
                        // La sentencia anterior no se utiliza, en su lugar se
                        // usa la llamada sentencia de asignacion compuesta
                        sumatoriaSalarios += persona.getSalario();
                        ++totalPersonas;
                }

                salarioMedio = sumatoriaSalarios / totalPersonas;

                System.out.println("Personas del genero Mujer, con salario superior a la media");

                for (Persona persona : personasArray) {
                        // El operador && tambien se le llama de short circuit
                        // (corto circuito), que si no se cumple una condicion
                        // de izquierda a derecha, ya no evalua las siguientes
                        if (persona.getGenero().equals(Genero.MUJER) &&
                                        persona.getSalario() > salarioMedio)
                                System.out.println(persona.toString());
                }

                /*
                 * SWITCH CASE.
                 * 
                 * Se utiliza como alternativa a un if else demasiado largo, es decir,
                 * cuando hay que utilizar una sentencia if else que evalue muchas
                 * condiciones, es mas eficiente, mas legible y facil de mantener
                 * utilizar switch case
                 * 
                 * Para demostrarlo: Vamos a crear un enum con los dias de la semana
                 * , le llamaremos DiasDeLaSemana
                 */

                DiasDeLaSemana dia = DiasDeLaSemana.VIERNES;

                if (dia.equals(DiasDeLaSemana.LUNES)) 
                        System.out.println("Hoy se trabaja");
                else if (dia.equals(DiasDeLaSemana.MARTES))
                        System.out.println("Hoy tambien se trabaja");
                else if (dia.equals(DiasDeLaSemana.MIERCOLES))
                        System.out.println("Hoy tambien se trabaja");
                else if (dia.equals(DiasDeLaSemana.JUEVES))
                        System.out.println("Hoy tambien se trabaja");
                else if (dia.equals(DiasDeLaSemana.VIERNES))
                        System.out.println("Es viernes y el cuerpo lo sabe");
                else
                        System.out.println("Es fin de semana");

                // Utilizando switch case
                
                switch (dia) {
                        case LUNES : {
                                System.out.println("Dia de trabajo");
                                break;
                        }
                        case MARTES : {
                                System.out.println("Dia de trabajo");
                                break;
                        }
                        case MIERCOLES : {
                                System.out.println("Dia de trabajo");
                                break;
                        }
                        case JUEVES : {
                                System.out.println("Dia de trabajo");
                                break;
                        }          
                        case VIERNES, SABADO, DOMINGO : {
                                System.out.println("Es fin de semana");
                                break;
                        }   
                        default : System.out.println("No es un dia de la semana");                                                          
                }

                /* Operador Ternario 
                 * condicion ? verdadera : falsa
                */

                int a = 20;
                int b = 20;

                String resultado = a > b ? "OK se cumple" : "No se cumple la condicion";

                System.out.println(resultado);

                // A peticion de Ivan, uso del operador ternario un poco mas avanzado
                int c = 40;
                int d = 40;
                int e = 60;
                int f = 70;

                resultado = a != b ? "A es desigual B" : c != d ? 
                         "C desigual a D" : e == f ? "E igual a F" :
                         "Final de las comparaciones";
                System.out.println("Ternarios anidados resultado " + resultado);

                // Sentencias para el control de flujo While y Do While.
                // Cuando se conoce a priori la cantidad de veces que se
                // van a ejecutar un conjunto de sentencias/instrucciones
                // se utiliza la sentencia for, de lo contrario While o Do
                // while

                int counter = 40;

                while (counter < 100) {
                       System.out.println(counter);
                       ++counter; 
                }

                // break y continue en un while
                // Ejemplo: Ejecutar un conjunto de sentencias mientras que 
                // el valor de counter sea menor que 20

                counter = 0;

                while (true) {
                        if (counter == 20) {
                                System.out.println("Saliendo del bucle while ...");
                                break;
                         } else if (counter == 10 ) {
                                System.out.println(("Counter ha llegado a 10"));
                              
                        } else if (counter == 5) {
                                counter += 5;
                               // continue;
                        } 
                        counter++;  
                        System.out.println("Valor actual del counter: " + counter);     
                }

                // do while. Evalua la condicion al final, es decir, que el grupo 
                // de instrucciones siempres se va ejecutar al menos una vez, aunque
                // ya no se cumpla la condicion

                int dd = 25;

                do {
                    System.out.println("Estoy dentro del do while");     
                } while(dd < 10);




        }
}
