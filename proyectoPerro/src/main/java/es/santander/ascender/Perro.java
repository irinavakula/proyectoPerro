package es.santander.ascender;

public class Perro {
    private double peso;

    public void comer(double peso) {
        this.peso += peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
