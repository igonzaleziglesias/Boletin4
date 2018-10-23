package boletin4_3;

public class Circulo {

    private double radio;
    private final double PI = 3.14;

    //constructores
    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double r) {
        this.radio = r;
    }

    //setters
    public void setRadio(double r) {
        this.radio = r;
    }

    //getters
    public double getRadio() {
        return this.radio;
    }

    public double area() {
        return Math.pow(this.radio, 2) * PI;
    }

    public double longitud() {
        return 2 * this.radio * PI;
    }
}
