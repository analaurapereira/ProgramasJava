package Curso.Aula11;

public class Main10 {
    public static void main(String[] args) {
        Visitante p1 = new Visitante();
        p1.setNome("João");
        System.out.println(p1.toString());

        Aluno p2 = new Aluno();
        p2.setNome("Cláudio");
        p2.setMatricula(23);
        p2.pagarMensalidade();

        AlunoBolsista p3 = new AlunoBolsista();
        p3.setNome("Jubileu");
        p3.pagarMensalidade();
    }
}