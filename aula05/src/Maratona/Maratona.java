package Maratona;

public class Maratona {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double altura;

    public Maratona(String nome, String sexo, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nome + " (" + sexo + ") - Idade: " + idade + ", Altura: " + altura;
    }
}
