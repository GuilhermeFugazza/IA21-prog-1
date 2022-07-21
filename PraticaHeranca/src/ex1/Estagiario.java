package ex1;

public class Estagiario extends Empregado {

    private int descontos;

    public Estagiario(int cod, String nom, String mail, double sal, double qtd, int desc) {
        super(cod, nom, mail, sal);
        this.descontos = desc;
    }

    public double aumentoSalarial(double percentual) {
        return this.salario * (percentual / 100) - this.descontos;
    }
}
