package ex1;

public class Quadrado {

    private int tamanhoLado;

    public Quadrado(int tam) {
        this.tamanhoLado = tam;
    }
        
    public void mudarValor(int tam) {
        this.tamanhoLado = tam;
    }
    
    public int calcularArea(int tam) {
        return this.tamanhoLado;
    }
    
    public int retornarValor () {
        return this.tamanhoLado;
    }
}
