package Curso.Aula10;

public class Main9 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("João");
        p2.setNome("Carlos");
        p3.setNome("Joana");
        p4.setNome("Cláudio");

        p2.setCurso("Matemática");
        p3.setSexo("F");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}