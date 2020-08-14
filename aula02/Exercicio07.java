import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );
        double salario, desconto;

        System.out.println("Digite o salário (R$):");
        salario = entrada.nextDouble();

        if (salario <= 600){
            System.out.println("Isento");
        } else {
            if(salario <= 1200){
                desconto = (float) (salario * 0.2);
                System.out.println("O valor do desconto é: R$ " + desconto);
            } else {
                if(salario <= 2000){
                    desconto = (float) (salario * 0.25);
                    System.out.println("O valor do desconto é: R$ " + desconto);
                } else {
                    desconto = (float) (salario * 0.3);
                    System.out.println("O valor do desconto é: R$ " + desconto);
                }
            }
        }
        entrada.close();
    }
}