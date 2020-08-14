import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha, digitada;

        senha = "R10p5";
        System.out.println("Digite a senha de acesso: ");
        digitada = entrada.nextLine();

        if (digitada.equals(senha) == true) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");
        }
        entrada.close();
    }
}