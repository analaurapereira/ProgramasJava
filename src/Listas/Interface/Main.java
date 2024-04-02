package Listas.Interface;
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Cidade rp = new Cidade();

        rp.contrata(p1);
        rp.contrata((Empregado) p1);
        rp.cobraDe(p1);
        rp.registra(p1);
        rp.alimenta(p1);

    }
}