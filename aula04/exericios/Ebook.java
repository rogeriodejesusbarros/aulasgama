package exericios;

public class Ebook {
    String titulo;
    String autor;
    int totalPaginas;
    int paginaAtual;

    public Ebook (String titulo, String autor, int totalPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
    }
    public void exibirPagina(){
        return.paginaAtual();
    }
        
    private Object paginaAtual() {
        return null;
    }

    public void avancarPagina() {
        if(paginaAtual < totalPaginas){
        paginaAtual++;
        } else {
            paginaAtual = totalPaginas;
        }
    }
    public void retrocederPagina(){
        if(paginaAtual > 0){
            paginaAtual--;
        }
    }
    public void irParaPagina(int pagina){
        if(pagina > totalPaginas || pagina < 0){
            System.out.println("Página inexistente");
        } else {
            paginaAtual = pagina;
        }
    }
    public void mostrarCapa(){
        if(paginaAtual = 0){
            System.out.println("Capa");
        }
    }
}