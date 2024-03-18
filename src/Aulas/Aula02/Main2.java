package Aulas.Aula02;

public class Main2 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Hundai", "hb20", "preto", 2020, true, 24000);
        Carro c2 = new Carro("fiat", "palio", "branco", 2018, false, 14000);

        System.out.println(c1.apresentacao());

    }
}
