package exericios;

import java.util.Scanner;

public class AppEbook {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count;

        System.out.println("Informe a quantidade de livros que quer cadastrar: ");
        count = entrada.nextInt();


        System.out.println("Digite o título do livro: ");
        titulo = entrada.nextLine();
        System.out.println("Digite o autor do livro: ");
        autor = entrada.nextLine();
        System.out.println("Digite a quantidade de páginas do livro: ");
        totalPaginas = entrada.nextInt();
        Ebook ebook1 = new Ebook(titulo, autor, totalPaginas);

        ebook1.paginaAtual();

        entrada.close();
    }
    
}