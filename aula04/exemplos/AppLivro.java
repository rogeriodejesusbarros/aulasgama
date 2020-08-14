package exemplos;

public class AppLivro {
public static void main(String[] args) {

    Livro livro = new Livro("Programação com Java", "LTC", "Deitel", 457);
    Livro ();

    /*
    livro.titulo = "Programação com Java";
    livro.autor = "Deitel";
    livro.disponivel = true;

    livro.emprestar();

    if(livro.estaDisponivel()){
        System.out.println("O livro " + livro.titulo + " está disponível");
    } else {
        System.out.println("O livro " + livro.titulo + "não está disponível");
    } */
    System.out.println(livro.exibir());
}
    
}