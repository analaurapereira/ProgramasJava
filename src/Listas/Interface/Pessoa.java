package Listas.Interface;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{

    @Override
    public void vota() {
        System.out.println("Votou");
    }

    @Override
    public void getRg() {
        System.out.println("Rg é 57693443-0");
    }

    @Override
    public void pagaIr() {
        System.out.println("Pagou");
    }

    @Override
    public void getCpf() {
        System.out.println("CPF é 521598935-04");
    }

    @Override
    public void trabalha() {
        System.out.println("Trabalhando");
    }

    @Override
    public void ensina() {
        System.out.println("Ensinando");
    }
}
