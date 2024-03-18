package Curso.Aula08;

public class Main7 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[2];

        l[0] = new Lutador("Big Boy", "Inglaterra", 24, 1.82f,
                71.5f, 123, 0, 0);

        l[1] = new Lutador("Pretty Boy", "França", 26, 1.72f,
                71.1f, 12,0,0);

        Luta UEC01 = new Luta();

        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].apresentar();

    }
}