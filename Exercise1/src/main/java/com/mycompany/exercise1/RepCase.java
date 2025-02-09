package com.mycompany.exercise1;

import java.util.Random;


public class RepCase {
    
    public static void main(String[] args) {
        do{
            System.out.println("Pegando bola de papel");
            System.out.println("Mirando...");
            System.out.println("Jogou!");
        }while(acertou());
    }
    
    public static boolean acertou(){
        Random gerador = new Random();
        boolean acertou = gerador.nextInt(3) == 1;
        if(acertou)
            System.out.println("acertou!");
        else
            System.out.println("Errou");
        return !acertou;
    }
}
