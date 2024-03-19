package Listas.L1.L1Ex1;

public class Main {
    public static void main(String[] args) {
       Aluno a1 = new Aluno(13, "Carlos", 17, 7.3f, 8.8f);

        a1.dadosAluno();
        System.out.println("Nota Final: " + a1.notaFinal());
        a1.passou();
    }
}