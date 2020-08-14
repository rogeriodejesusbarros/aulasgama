import java.util.Scanner;

public class Exercicioaluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );
        float nota;

        System.out.println("Digite a nota: ");
        nota = entrada.nextFloat();

        if(nota >= 6){
            System.out.printf("Aluno aprovado: Nota " + nota);

            entrada.close();
        }
    }
    
}