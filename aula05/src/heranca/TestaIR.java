package heranca;

public class TestaIR {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João", 5000, "123.456.789-00", "MG-12.345.678");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", 20000, "12.345.678/0001-99", "123456");

        System.out.println(pf);
        System.out.println(pj);
    }
}
