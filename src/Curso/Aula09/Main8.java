package Curso.Aula09;

public class Main8 {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[3];
        Livro [] l = new Livro[2];

        p[0] = new Pessoa("João", 16,"M");
        p[1] = new Pessoa("Pedro", 20,"M");
        p[2] = new Pessoa("Ana", 18,"F");

        l[0] = new Livro("Game of Thrones", "George R.R. Martin",956, p[2]);
        l[1] = new Livro("O Código Da Vinci", "Dan Brown", 420, p[0]);

        System.out.println(l[0].detalhes());
        l[1].abrir();
        l[1].folhear(342);

    }
}