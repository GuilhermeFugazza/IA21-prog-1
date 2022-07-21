package ex1;

public class Chefe extends Empregado{
    private double beneficio;

    public Chefe(int cod, String nom, String mail, double sal, double ben) {
        super(cod, nom, mail, sal);
        this.beneficio = ben;
    }
    
    public double aumentoSalarial(double percentual) {
        return this.salario * (percentual / 100) + this.beneficio;
    }
}
