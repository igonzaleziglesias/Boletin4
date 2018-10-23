package boletin4_1;

import java.util.Scanner;

public class Coche {

    private int velocidade;

    public Coche() {
        velocidade = 0;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void acelerar(int a) {
        this.velocidade = this.velocidade + a;
    }

    public void frenar(int f) {
        this.velocidade = this.velocidade - f;
    }

}
