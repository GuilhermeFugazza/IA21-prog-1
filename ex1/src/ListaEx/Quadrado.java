package ListaEx;

public class Quadrado {

    private int tamanhoLado;

    public Quadrado(int tam) {
        this.tamanhoLado = tam;
    }
        
    public void mudarValor(int tam) {
        this.tamanhoLado = tam;
    }
    
    public int calcularArea() {
        return this.tamanhoLado * this.tamanhoLado;
    }
    
    public int retornarValor () {
        return this.tamanhoLado;
    }
}
