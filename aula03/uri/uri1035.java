package uri;

import java.util.Scanner;

/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de 
C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a 
mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.
*/

public class uri1035 {
    public static void main(final String[] args) {
        //leitura das variáveis
        Scanner in = new Scanner ( System.in );
        int a, b, c, d;
        System.out.println("Digite o Valor A: ");
        a = in.nextInt();
        System.out.println("Digite o Valor B: ");
        b = in.nextInt();
        System.out.println("Digite o Valor C: ");
        c = in.nextInt();
        System.out.println("Digite o Valor D: ");
        d = in.nextInt();

    in.close();

    if((b > c) && (d > a) && (c + d > a + b) && (c > 0) && (d > 0) && (a % 2 == 0)) {
        System.out.println("Valores aceitos");
    } else {
        System.out.println("Valores nao aceitos");
    }
}
}