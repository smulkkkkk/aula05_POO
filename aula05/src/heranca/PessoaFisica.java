package heranca;

public class PessoaFisica extends ImpostoDeRenda {
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
        super(nome, rendimentos);
        this.cpf = cpf;
        this.rg = rg;
    }

    public double calculoIR() {
        return rendimentos * 0.12;
    }

    @Override
    public String toString() {
        return "Pessoa Física: " + nome + " - CPF: " + cpf + 
               " - IR a pagar: " + calculoIR();
    }
}
