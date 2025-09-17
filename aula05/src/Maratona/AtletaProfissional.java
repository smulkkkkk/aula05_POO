package Maratona;

public class AtletaProfissional extends Maratona {
    private double peso;

    public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
        super(nome, sexo, idade, altura);
        this.peso = peso;
    }

    public void verificaSituacao() {
        if (idade > 18 || altura >= 1.80) {
            System.out.println(nome + " participará da maratona!");
        } else {
            System.out.println(nome + " não participará da maratona.");
        }
    }
}