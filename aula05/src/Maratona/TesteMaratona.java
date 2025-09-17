package Maratona;

public class TesteMaratona {
    public static void main(String[] args) {
        AtletaAmador a1 = new AtletaAmador("Carlos", "M", 20, 1.75, true);
        AtletaProfissional a2 = new AtletaProfissional("Ana", "F", 17, 1.82, 60);
        AtletaProfissional a3 = new AtletaProfissional("Lucas", "M", 16, 1.70, 55);

        System.out.println(a1);
        a1.verificaSituacao();

        System.out.println(a2);
        a2.verificaSituacao();

        System.out.println(a3);
        a3.verificaSituacao();
    }
}