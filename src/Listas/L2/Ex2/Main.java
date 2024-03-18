package Listas.L2.Ex2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(123456, "Carlos", 13, 7.5f, 5.5f);

        System.out.println(a1.toString());
        a1.notaFinal();
    }
}
