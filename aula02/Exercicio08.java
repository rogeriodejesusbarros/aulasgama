import java.util.Scanner;

public class Exercicio08 {
    public static void main(final String[] args) {
        final Scanner entrada = new Scanner(System.in);

        // Ler informações do aluno referentes a notas e faltas
        float nota1, nota2, nota3, nota4, exame, media;
        int faltas;

        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextFloat();
        System.out.println("Digite a nota 3: ");
        nota3 = entrada.nextFloat();
        System.out.println("Digite a nota 4: ");
        nota4 = entrada.nextFloat();
        System.out.println("Informe a quantidade de faltas: ");
        faltas = entrada.nextInt();

        media = (float)((nota1 + nota2 + nota3 + nota4) / 4);

        //teste de aprovação ou reprovação por faltas
        if(faltas >= 16){
            System.out.println("Aluno reprovado por faltas: Total de " + faltas + " faltas");
            System.out.println("Média final: " + media);
        } else {
            //teste de aprovação ou reprovação com média acima de 6
            if (media >= 6){
                System.out.println("Aluno aprovado com média " + media);
            } else {
                //ler a nota do exame e calcular a média final
                System.out.println("Informe a nota no exame: ");
                exame = entrada.nextFloat();
                media = (float)((media + exame) / 2);
                if (media > 5){
                    System.out.println("Aluno aprovado em exame com média " + media);
                } else {
                    System.out.println("Aluno reprovado com média " + media);
                }
                
            }
        }
entrada.close();
    }
    
}