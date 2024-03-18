package Listas.L1.L1Ex1;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    public float notaFinal() {
        return (this.getP1() + this.getP2()) / 2;
    }

    public void dadosAluno() {
        System.out.println("Número do Aluno: " + getNumeroAluno());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }

    public void passou() {
        if(this.notaFinal()>=6.0){
            System.out.println("O aluno passou com "+ this.notaFinal()+ " pontos");
        }

        else{
            System.out.println("O aluno não passou porque tirou "+notaFinal() +" pontos");
        }

    }
}
