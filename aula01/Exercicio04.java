import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );

        float salariominimo;
        float quilowatt;
        float consumokw;

        System.out.println("Digite o valor do salário mínimo (R$): ");
        salariominimo = entrada.nextFloat();

        quilowatt = (salariominimo / 500);

        System.out.println("Valor do quilowatt (R$): " + quilowatt);

   
    }
    
}