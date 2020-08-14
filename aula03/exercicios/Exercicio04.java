package exercicios;

import java.util.Scanner;

/** Escreva um programa que leia 10 números inteiros e exiba quantos são pares e quantos são ímpares */

public class Exercicio04 {
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont, numero, par, impar;

        cont = 1;
        numero = 0;
        par = 0;
        impar = 0;

        while (cont <= 10){
            System.out.println("Digite o " + cont + "º número: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0){
                par++;
            } else {
                impar++;
            }
            cont++;
        }

        entrada.close();

        System.out.println("O total de pares é: " + par);
        System.out.println("O total de ímpares é: " + impar);

    }
    
}