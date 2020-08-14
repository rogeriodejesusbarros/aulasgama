package uri;

import java.util.Scanner;

/**
 * uri1003
 */
public class uri1003 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in);
        int a, b, soma;

        a = entrada.nextInt();
        b = entrada.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

        /*
        %s - String
        %d - inteiros
        %f - float ou double

        \n - pular para a próxima linha

        */
        //System.out.printf("%d + %d = %.1f\n", a, b, soma);

        entrada.close();
    }
}