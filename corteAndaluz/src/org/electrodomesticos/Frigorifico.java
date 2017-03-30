package org.electrodomesticos;

public class Frigorifico extends Electrodomestico {

    double capacidadTotal;


    double capacidadCongelador;
    String caracteristicas;

    // Constructor por defecto.
    public Frigorifico() {
    }

    // Constructor designado.
    public Frigorifico(double capacidadTotal,
                       double capacidadCongelador,
                       String caracteristicas) {
        this.capacidadTotal = capacidadTotal;
        this.capacidadCongelador = capacidadCongelador;
        this.caracteristicas = caracteristicas;
    }

    // Getters y setters.
    public double getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(double capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public double getCapacidadCongelador() {
        return capacidadCongelador;
    }

    public void setCapacidadCongelador(double capacidadCongelador) {
        this.capacidadCongelador = capacidadCongelador;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Frigorifico{" +
                "capacidadTotal=" + capacidadTotal +
                ", capacidadCongelador=" + capacidadCongelador +
                ", caracteristicas='" + caracteristicas + '\'' +
                '}';
    }
}