package org.electrodomesticos;

public class Lavadora extends Electrodomestico {


    String tipoCarga;
    double velocidadCentrifugado;
    String tipo;

    // Constructor por defecto.
    public Lavadora() {
    }

    // Constructor designado.
    public Lavadora(String tipoCarga,
                    double velocidadCentrifugado,
                    String tipo) {
        this.tipoCarga = tipoCarga;
        this.velocidadCentrifugado = velocidadCentrifugado;
        this.tipo = tipo;
    }

    // Getters y setters.
    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public double getVelocidadCentrifugado() {
        return velocidadCentrifugado;
    }

    public void setVelocidadCentrifugado(double velocidadCentrifugado) {
        this.velocidadCentrifugado = velocidadCentrifugado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "tipoCarga='" + tipoCarga + '\'' +
                ", velocidadCentrifugado=" + velocidadCentrifugado +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}