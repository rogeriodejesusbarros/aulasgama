import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );

        float num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextFloat();

        if (num1 > num2) {
            System.out.printf("%f.2, %f.2\n", num1, num2);}
            else {
                System.out.printf("%f.2, %f.2\n", num2, num1);}
        entrada.close();
            }
}