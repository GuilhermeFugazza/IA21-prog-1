package ex1;

public class Bola {
    private String cor, material; 
    private double circunferencia;
    
    public Bola(String c, String mat, double cir) {
        this.cor = c;
        this.material = mat;
        this.circunferencia = cir;
    }
    public void trocarCor (String c) {
        this.cor = c;
    }
    public String mostrarCor () {
        return this.cor;
    }
}
