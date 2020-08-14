import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.printf("Digite a Nota 1: ");
        nota1 = entrada.nextFloat();

        System.out.printf("Digite a Nota 2: ");
        nota2 = entrada.nextFloat();

        media = (float) ((nota1 * 0.4) + (nota2 * 0.6));

        if (media >= 6) {
            System.out.println("Aluno aprovado com média " + media);
        }
        else {
            System.out.println("Aluno reprovado com média " + media);
        }
        entrada.close();
    }
}