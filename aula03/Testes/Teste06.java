package Testes;

import java.util.Scanner;

public class Teste06 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int inicio;

        System.out.println("Qual o número inicial?");
        inicio = in.nextInt();

        for (; inicio < 10;){
            System.out.println(inicio);
            if(inicio % 2 == 0){
                inicio++;
            } else {
                inicio += 2; //inicio = inicio + 2;
            }
        }
        in.close();
    }
    
}