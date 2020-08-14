package exercicios;

import java.util.Scanner;

/** Escreva um programa que exiba a tabuada do número digitado pelo usuário. */

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );
        int numero, tabuada;

        System.out.println("Digite o número: ");
        numero = entrada.nextInt();

        tabuada = 1;

        while (tabuada <=10){
            System.out.println(tabuada + " x " + numero + " = " + (tabuada*numero));
            //System.out.printf(%d, %);
            tabuada++;
        }
        entrada.close();
    }
    
}