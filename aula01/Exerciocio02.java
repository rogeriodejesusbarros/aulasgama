import java.util.Scanner;

public class Exerciocio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        float media;
        float nota1;
        float nota2;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        media = ((nota1 + nota2) / 2);

        System.out.println("A nota média é: " + media);

        entrada.close();

    }
    
}