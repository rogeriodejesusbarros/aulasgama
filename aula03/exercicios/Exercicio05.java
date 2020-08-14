package exercicios;

import java.util.Scanner;

/** Escrea um programa que leia vário números inteiros, até que o usuário digite 0 (zero), e exiba a soma dos valores 
 * digitados.
 * Exemplo: 
 * Digite o 1º número: 4
 * Digite o 1º número: 4
 * ....
 * Digite o Nº número: 0
 * A soma dos valores é: ____________________*/

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );
        int numero, soma;
        numero = 1;
        soma = 0;
        
        while (numero != 0){
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            soma = (soma + numero);
        }
        System.out.println("A soma dos valores é: " + soma);

        entrada.close();
    }
    
}