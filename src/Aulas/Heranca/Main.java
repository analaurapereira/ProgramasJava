package Aulas.Heranca;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("João", "Rua Junior", "123554324", 1234.87f, 1234.76f);
        Assistente a1 = new Assistente("Joana", "Rua A0", "1343432423", 9876.98f, 3, 300);
        Diretor d1 = new Diretor("Carlos", "Rua 23", "23454356", 2343.34f, 2322.54f);

        System.out.println(g1.toString()+"\n");
        System.out.println(a1.toString()+"\n");
        System.out.println(d1.toString()+"\n");
    }
}
