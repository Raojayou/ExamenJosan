package org.electrodomesticos;

import java.util.Scanner;

public class Operaciones extends Electrodomestico {

    public static void main(String[] args) {
        // Constantes
        final double precio_base = 70;  // Precio base.
        double plus_eficiencia = 1.50;  // Incremento por plus de eficiencia.
        // Variables
        Scanner entrada = new Scanner(System.in);
        int precio;
        double precio_bruto;
        String nombre;

        // Lectura de datos
        System.out.println("Introduzca el nombre del Electrodoméstico: ");
        nombre = entrada.nextLine();
        System.out.println("Introduzca el precio: ");
        precio = entrada.nextInt();

        // Cálculo del Precio Bruto.
        if (precio == 0) {
            precio_bruto = precio_base * plus_eficiencia;

            // Cálculo del plus de eficiencia.
            plus_eficiencia = precio_bruto - precio_base;

            // Impresión de resultados
            System.out.printf("Precio Bruto: %.2f\n", precio_bruto);
            System.out.printf("Plus de Eficiencia: %.2f\n", plus_eficiencia);
        }
    }
}
