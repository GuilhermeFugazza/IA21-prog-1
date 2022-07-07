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
        System.out.println("O tamanho do quadrado é " + xuxa.retornarValor());
        xuxa.mudarValor(50);
        System.out.println("O tamanho do quadrado é " + xuxa.retornarValor());
        xuxa.calcularArea();
        System.out.println("O tamanho do quadrado é " + xuxa.retornarValor());
    }
}
