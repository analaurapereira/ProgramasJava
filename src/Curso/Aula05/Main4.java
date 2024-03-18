package Curso.Aula05;

public class Main4 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.abrirConta("CC");
        p1.setDono("João");
        p1.depositar(12);

        p1.estadoAtual();
    }
}