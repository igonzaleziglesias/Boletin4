package boletin4_3;

import java.util.Scanner;

public class Boletin4_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Circulo unCirculo = new Circulo();

        System.out.println("Introduce o radio: ");
        unCirculo.setRadio(ler.nextDouble());

        System.out.println("\nRadio=" + unCirculo.getRadio());
        System.out.println("Area= " + unCirculo.area());
        System.out.println("Longitud= " + unCirculo.longitud());

        Circulo outroCirculo = new Circulo(10);

        System.out.println("\nRadio=" + outroCirculo.getRadio());
        System.out.println("Area= " + outroCirculo.area());
        System.out.println("Longitud= " + outroCirculo.longitud());

    }

}
