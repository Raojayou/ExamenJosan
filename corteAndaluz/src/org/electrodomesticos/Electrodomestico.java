package org.electrodomesticos;

public class Electrodomestico {
    // Constantes.
    String marca;
    String modelo;
    double precioBase;
    double altura;
    double anchura;
    double peso;

    // Constructor por defecto.
    public Electrodomestico() {
    }
    // Constructor designado.
    public Electrodomestico(String marca,
                            String modelo,
                            double precioBase,
                            double altura,
                            double anchura,
                            double peso)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                ", altura=" + altura +
                ", anchura=" + anchura +
                ", peso=" + peso +
                '}';
    }
}
