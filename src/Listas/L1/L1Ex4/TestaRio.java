package Listas.L1.L1Ex4;


public class TestaRio {
    public static void main(String[] args) {
        Rio r1 = new Rio("Nilo", 5.0f, true);
        Rio r2 = new Rio();

        r2.setNome("Amazonas");
        r2.chover(4);

        r1.chover(3);
        r1.limpar();


        System.out.println(r1.mostrar());
        System.out.println(r2.mostrar());
    }
}