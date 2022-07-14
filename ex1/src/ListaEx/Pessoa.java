package ListaEx;

public class Pessoa {

    public String nome;
    private double peso;
    private double altura;
    private int idade;

    public Pessoa(String nome, double peso, double alt, int idade) {
       this.nome = nome;
       this.peso = peso;
       this.altura = alt;
       this.idade = idade;
    }
    
    public String Nome(){
        return this.nome;
    }
    
    public int Envelhecer() {
        return (this.idade + 1);
    }

    public double Engordar() {
        return (this.peso);
    }

    public double Emagrecer() {
        return (this.peso);
    }

    public double Crescer() {
        if (this.idade <= 21) {
            this.altura = this.altura + 0.05;
        }
        return (this.altura);
    }
}
