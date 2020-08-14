import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();

        if(numero > 20){
            System.out.println("Número maior do que 20 - Resultado: " + (numero /2));
            System.out.printf("Número maior do que 20 - Resultado: %.2f\n" + ((float)numero /2));

            entrada.close();
        }
    }
    
}