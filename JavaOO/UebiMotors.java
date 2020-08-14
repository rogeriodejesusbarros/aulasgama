public class UebiMotors {

    public static void main(String[] args) {
        
        // criei uma variável do tipo "Carro"
        Carro c,c2;

        // instanciar na memória toda a estritira que define o carro
        c = new Carro(); // agora eu tenho o objeto c do tipo Carro

        // vamors preencher?
        c.marca         = "Fiat";
        c.modelo        = "Uninho da Vivo";
        c.ano           = 1990;
        c.km            = 320000;
        c.cor           = "Branco";
        c.combustivel   = "Gasolina, mas também funciona a Alcool";
        c.preco         = 5300.00;

        c2 = new Carro();
        c2.marca       = "Chevrolet";
        c2.modelo      = "Corsinha";
        c2.ano         = 2003;
        c2.km          = 320000;
        c2.cor         = "Vinho";
        c2.combustivel = "Alcool";
        c2.preco       = 8962.5;

        //vamos imprimir algumas coisas?
        System.out.println("Carro = " + c.marca + "/" + c.modelo);
        System.out.println("   R$   " + c.preco);
        double imp1 = c.calcularIPVA();
        System.out.println("  IPVA  " + imp1);

        // outro carro
        System.out.println("Carro = " + c2.marca+"/"+c2.modelo);
        System.out.println("   R$   " + c2.preco);
        double imp2 = c2.calcularIPVA();
        System.out.println("  IPVA   " + imp2);
    }
}