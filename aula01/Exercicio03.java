import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );

        float salario;
        float aumento;
        float novosalario;

        System.out.println("Digite o salário atual (R$): ");
        salario = entrada.nextFloat();

        System.out.println("Digite o aumento percentual: ");
        aumento = entrada.nextFloat();

        novosalario = (((aumento / 100) + 1) * salario);

        System.out.println("O novo salário é de R$ " + novosalario);

        entrada.close();

    }
    
}