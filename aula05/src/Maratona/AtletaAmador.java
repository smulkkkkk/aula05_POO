package Maratona;

public class AtletaAmador extends Maratona {
    private boolean atestado;

    public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
        super(nome, sexo, idade, altura);
        this.atestado = atestado;
    }

    public void verificaSituacao() {
        if (idade > 18 || altura >= 1.80) {
            System.out.println(nome + " participará da maratona!");
        } else {
            System.out.println(nome + " não participará da maratona.");
        }
    }
}