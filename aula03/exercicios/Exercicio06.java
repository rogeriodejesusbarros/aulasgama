package exercicios;

import java.util.Scanner;

/**Faça um programa que receba 10 número, calcule e mostre:
 * 1. A soma dos números digitados
 * 2. A quantidade de números positivos foram digitados
 * 3. A média dos números digitados
 * 4. A porcentagem dos números positivos entre todos os números digitados
 */

public class Exercicio06 {
    public static void main(final String[] args) {
        Scanner in = new Scanner ( System.in );
        double numero, soma, media, percent;
        int positivos, cont, repete;

        soma = 0;
        positivos = 0;

        System.out.println("Digite quantos números serão digitados: ");
        repete = in.nextInt();

        //receber os 10 números
        for(cont = 1;cont <= repete;cont++){
            System.out.println("Digite o " + cont + "º número");
            numero = in.nextDouble();
            soma = soma + numero;
            if (numero > 0){
                positivos++;
            }
        }
        //somar os números
        System.out.println("Soma: " + soma);

        //tirar a média dos números
        media = (double)soma / repete;
        System.out.printf("Média: %.4f\n", media);    

        //calcular o percentual de números positivos digitados
        percent = (positivos / soma) * 100;
        System.out.printf("Percentual de positivos: %.2f\n", percent);
              
    in.close();
    }
}