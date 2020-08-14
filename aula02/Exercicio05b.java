import java.util.Scanner;

/*
A prefeitura do Rio de Janeiro abriu uma linha de crédido para os funcionários estatutários.
Entretando o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
Faça um programa que leia o salário bruto e o valor da prestação e informa se o empréstimo pode 
ou não ser concedido.
 */

public class Exercicio05b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );
        float salario, prestacao, emprestimo, parcelas, tempo;

        System.out.println("Informe o valor total do empréstimo: ");
        emprestimo = entrada.nextFloat();

        System.out.println("Informe a quantidade de parcelas:");
        tempo = entrada.nextInt();

        parcelas = emprestimo / tempo;

        System.out.println("Informe o valor do salário bruto: ");
        salario = entrada.nextFloat();

        prestacao = (float) (salario * 0.3);

        if (parcelas <= prestacao){
            System.out.println("O empréstimo pode ser concedido!");
        } else {
            System.out.println("O empréstimo não pode ser concedido");
        }
        entrada.close();
    }   
}