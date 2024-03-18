package Curso.Aula07;

public class Main6 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[2];

        l[0] = new Lutador("Big Boy", "Inglaterra", 24, 1.82f,
                92.5f, 123, 0, 0);

        l[0].apresentar();
        l[0].status();

        l[1] = new Lutador("Pretty Boy", "França", 26, 1.72f,
                71.1f, 12,0,0);

        l[1].apresentar();
        l[1].status();
    }
}