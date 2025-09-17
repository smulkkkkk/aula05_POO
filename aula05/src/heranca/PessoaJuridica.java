package heranca;

public class PessoaJuridica extends ImpostoDeRenda {
    private String cnpj;
    private String inscEstadual;

    public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
        super(nome, rendimentos);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
    }

    public double calculoIR() {
        return rendimentos * 0.15;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica: " + nome + " - CNPJ: " + cnpj + 
               " - IR a pagar: " + calculoIR();
    }
}
