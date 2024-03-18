package Listas.L2.Ex2;

public class Aluno {
    private int numAluno;
    private int idade;
    private String nome;
    private float p1;
    private float p2;
    public Aluno(int numAluno, String nome, int idade, float p1, float p2) {
        setNumAluno(numAluno);
        setNome(nome);
        setIdade(idade);
        setP1(p1);
        setP2(p2);
    };

    public int getNumAluno() {
        return numAluno;
    }

    public void setNumAluno(int numAluno) {
        if (numAluno >= 0 && String.valueOf(numAluno).length() == 6) {
            this.setNumAluno(numAluno);
        }

        else {
            System.out.println("Número do aluno inválido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.setIdade(idade);
        }

        else {
            System.out.println("Idade do aluno não pode ser negativa.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.setNome(nome);
        }

        else {
            System.out.println("Nome do aluno muito longo. Deve ter no máximo 30 caracteres.");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.setP1(p1);
        }

        else {
            System.out.println("Nota P1 não pode ser negativa.");
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.setP2(p2);
        }

        else {
            System.out.println("Nota P2 não pode ser negativa.");
        }
    }
    public void notaFinal() {
        float media = (p1 + p2) / 2;
        System.out.println("Média Final do Aluno " + this.getNumAluno() + ": " + media);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "numAluno=" + numAluno +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}