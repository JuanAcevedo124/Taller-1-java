package com.mycompany.taller1;

/**
 * Taller 1 - Primer programa en Java
 * Demuestra el uso de los 8 tipos de datos primitivos + constante final
 * y la diferencia entre System.out.print y System.out.println
 */
public class Taller1 {
    public static void main(String[] args) {
        // Mensaje inicial
        System.out.println("=== Mi Primer Programa en Java ===");
        System.out.println("Hola, soy estudiante de CampusLands - Taller 1");
        System.out.println();

        // 1. Declaracion de los 8 tipos primitivos
        boolean esEstudiante = true;          // 1 bit, true/false
        byte edad = 25;                        // 8 bits, -128 a 127
        short codigoPostal = 15001;            // 16 bits, -32768 a 32767
        int poblacionCiudad = 520000;         // 32 bits, ~ +-2.1e9
        long poblacionMundial = 8000000000L;  // 64 bits, requiere L al final
        float promedioNotas = 4.5f;           // 32 bits, precision simple, requiere f
        double pi = 3.14159265359;            // 64 bits, precision doble
        char inicialNombre = 'J';             // 16 bits, caracter Unicode

        // 2. Constante con final
        final double GRAVEDAD = 9.81;         // constante, no se puede reasignar
        final int ANIO_ACTUAL = 2026;

        // 3. Impresion identificando cada tipo
        System.out.println("--- Tipos de datos primitivos ---");
        System.out.println("Valor boolean (esEstudiante): " + esEstudiante);
        System.out.println("Valor byte (edad): " + edad);
        System.out.println("Valor short (codigoPostal): " + codigoPostal);
        System.out.println("Valor int (poblacionCiudad): " + poblacionCiudad);
        System.out.println("Valor long (poblacionMundial): " + poblacionMundial);
        System.out.println("Valor float (promedioNotas): " + promedioNotas);
        System.out.println("Valor double (pi): " + pi);
        System.out.println("Valor char (inicialNombre): " + inicialNombre);
        System.out.println();
        
        System.out.println("--- Constantes (final) ---");
        System.out.println("Constante double GRAVEDAD: " + GRAVEDAD);
        System.out.println("Constante int ANIO_ACTUAL: " + ANIO_ACTUAL);
        System.out.println();

        // 4. Demostracion print vs println
        System.out.println("--- Diferencia print vs println ---");
        System.out.print("Esto es con print (sin salto) -> ");
        System.out.print("sigue en la misma linea. ");
        System.out.println("Ahora con println salta a la siguiente linea.");
        System.out.println("Esta linea ya esta separada gracias a println.");
    }
}