package exercicios;
/* Escreva um progrma que leia um número inteiro N e exiba a sequência:
1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024,... enquanto o valor for menor ou igual à N.
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );
        int n, calc;

        System.out.print("Digite o número: ");
        n = entrada.nextInt();

        calc = 2;
        System.out.print("1");
        while (calc <= n){
            System.out.printf(", %d", calc);
            calc = calc * 2;
        }
        entrada.close();
    }
    
}