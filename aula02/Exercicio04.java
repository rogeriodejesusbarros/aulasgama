import java.util.Scanner;

public class Exercicio04 {
    public static void main(final String[] args) {
        final Scanner entrada = new Scanner ( System.in );

        float ladoa, ladob, ladoc;
           
        System.out.println("Digite o comprimento a: ");
        ladoa = entrada.nextFloat();
        System.out.println("Digite o comprimento b: ");
        ladob = entrada.nextFloat();
        System.out.println("Digite o comprimento c: ");
        ladoc = entrada.nextFloat();

        if(ladoa > ladob + ladoc){
            System.out.println("Não existe triângulo");
        } else {
            if(ladoa == ladob && ladob == ladoc){
                System.out.println("O triângulo é equilátero");
            } else {
                if(ladoa == ladob || ladoa == ladoc || ladob == ladoc){
                    System.out.println("O triângulo é isósceles");
                } else {
                    System.out.println("O triângulo é escaleno");
                }
            }
        }
        entrada.close();
    }
}