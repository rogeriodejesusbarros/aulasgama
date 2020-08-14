package exemplos;

import sun.tools.jconsole.inspector.Utils.EditFocusAdapter;

/**
 * Livro
 */
//atributos do livro: características do livro
 public class Livro {
    String titulo;
    String editora;
    String autor;
    int numeroPaginas;
    boolean disponivel;

    //método construtor: inicializa os atributos do objeto
    //ele tem o mesmo nome da classe
    public Livro(String titulo, String editora, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        disponivel = true;
    }

    //métodos do livro: ações ou comportamentos do livro
    public void emprestar(){
        disponivel = false;
    }
    public void devolver(){ //void significa que o mtodo não tem retorno
        disponivel = true;
    }
    public boolean estaDisponivel(){
        return disponivel;
    }

    //criar um método para exibir os dados de um livro
    public void exibir(){
            System.out.println("Livro: " + titulo + " : " + autor + ", " + editora + " -" + numeroPaginas + "(" + disponivel ")");
        }

    }


}