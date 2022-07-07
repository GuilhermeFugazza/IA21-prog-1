package ex1;

public class Ex1 {

    public static void main(String[] args) {
        // Teste Bola
        Bola bolinha = new Bola("azul", "plastico", 45.2);
        System.out.println("A bola é de cor " + bolinha.mostrarCor());
        bolinha.trocarCor("verde");
        System.out.println("A nova cor da bola é " + bolinha.mostrarCor());
        
        //Teste Quadrado
        Quadrado xuxa = new Quadrado(100);
        System.out.println("\nO tamanho do quadrado é " + xuxa.retornarValor());
        xuxa.mudarValor(50);
        System.out.println("O tamanho do quadrado é " + xuxa.retornarValor());
        xuxa.calcularArea();
        System.out.println("O tamanho do quadrado é " + xuxa.retornarValor());
        
       
        //Teste Pessoa
        Pessoa linda = new Pessoa("Guilherme", 67.4, 1.85, 20);
        System.out.println("\nO nome da Pessoa é " + linda.Nome() + "!");
        System.out.println("E " + linda.Nome() + " está com " + linda.Envelhecer() + " anos de idade");
        System.out.println("Está com " + linda.Engordar() + "Kg.");
        System.out.println(linda.Nome() + " Tem " + linda.Crescer() + " metros de altura.");
    }
}
