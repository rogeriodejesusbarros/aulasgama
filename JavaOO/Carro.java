//aqui começo a definição do tipo de dado Carro
public class Carro {

    //aqui vou definir todas as propriedades (como se fossem variáveis)
    String marca;
    String modelo;
    int    ano;
    String cor;
    String combustivel;
    int    km;
    double preco;

    // funcionalidades / comportamento / métodos
    /*void calcularIPVA(){ //void é vazio
        if (ano < 2000) {
            System.out.println("Valor Isento do IPVA - Ufa!");
        } else {
            double valorIPVA;
        valorIPVA = preco * 0.04;
        System.out.println("Valor do IPVA = " + valorIPVA);
        }*/

        // Agora deixando o objeto só para realizar os cálculos, sem impressões
        double calcularIPVA() {
            double valordevido;
            if (ano < 2000) {
                valordevido = 0.0;
            } else {
                valordevido = preco * 0.04;
            }
            return calcularIPVA();
    }
}