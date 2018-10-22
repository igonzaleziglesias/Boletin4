
package boletin4_4;
import java.util.Scanner;

public class Boletin4_4 {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Polbo restaurante = new Polbo(2,3);
        Boolean r;
        
        restaurante.amosarPolbo();
        restaurante.amosarPatatas();
        
        System.out.print("Pueden comer: "+ restaurante.clientes()+" clientes");   
        System.out.println("\nComen?(true/false): ");
        r = ler.nextBoolean();
        if (r==true){
            restaurante.comen();
        } 
        restaurante.amosarPolbo();
        restaurante.amosarPatatas();
        
        
        System.out.print("\nCuantos kg de Polbo engade?: ");
        restaurante.engadirPolbo(ler.nextInt());
        System.out.print("Cuantos kg de Patatas engade?: ");
        restaurante.engadirPatatas(ler.nextInt());
        
        
        System.out.print("\nPueden comer: "+ restaurante.clientes()+" clientes");
        System.out.print("\nComen?(true/false): ");
        r = ler.nextBoolean();
        if (r=true){
            restaurante.comen();
        } 
        
        restaurante.amosarPolbo();
        restaurante.amosarPatatas();
        
        
        
        
        
        
    }   
    
}
