package exercicios;
/**
 * Escreva um programa que exiba a sequência de números de 100 à 200.
 * Exemplo: 100 101 102 103... 198 199 200
 */
public class Exercicio01 {
    public static void main(String[] args) {
        int cont;

        //iniciando de 100
        cont = 100;

        //conte até 200
        while (cont <= 200){
            System.out.print(cont + " ");
            cont++;
        }
        
        //Contando ao contrário
         cont = 200;
         while (cont >= 100){
            System.out.print(cont + " ");
            cont--;
         }
    }
    
}