package Testes;

public class Teste05 {
    public static void main(final String[] args) {
        int cont;

        cont = 1;

        while (cont < 4){
            System.out.println(cont);
            cont++;
        }
        for (cont = 1; cont < 4; cont++);
        System.out.println(cont);
    }
    
}