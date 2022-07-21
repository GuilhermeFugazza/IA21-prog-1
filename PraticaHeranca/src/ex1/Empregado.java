package ex1;

public class Empregado {

    private int codigo;
    private String nome, email;
    protected double salario;

    public Empregado(int cod, String nom, String mail, double sal) {
        this.codigo = cod;
        this.nome = nom;
        this.email = mail;
        this.salario = sal;
    }

    public double getSalario() {
        return this.salario;
    }
    
    public double aumentoSalarial(double percentual) {
        return this.salario * (percentual / 100);
    }
}
