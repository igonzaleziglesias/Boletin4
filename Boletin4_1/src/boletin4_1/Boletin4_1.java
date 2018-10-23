package boletin4_1;

import java.util.Scanner;

public class Boletin4_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Coche unCoche = new Coche();
        System.out.println("Velocidade = " + unCoche.getVelocidade() + " km/h");

        System.out.print("\nCanto quere incrementar a velocidade = ");
        unCoche.acelerar(ler.nextInt());

        System.out.println("Velocidade = " + unCoche.getVelocidade() + " km/h");

        System.out.print("\nCanto quere frenar a velocidade = ");
        unCoche.frenar(ler.nextInt());

        System.out.println("Velocidade = " + unCoche.getVelocidade() + " km/h");

    }
}
