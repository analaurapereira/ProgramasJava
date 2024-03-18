package Aulas.Aula01;

public class Time {

    public String nome;
    public int jogadoras;
    public boolean ativa;
    public String serie;

    public Time(String nome, int jogadoras, boolean ativa, String serie) {
        this.nome = nome;
        this.jogadoras = jogadoras;
        this.ativa = ativa;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getJogadoras() {
        return jogadoras;
    }

    public void setJogadoras(int jogadoras) {
        this.jogadoras = jogadoras;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }


    public void apresentar(){
        System.out.println("----------APRESENTANDO-------");
        System.out.println("Time: " + this.getNome());
        System.out.println("Com " +this.getJogadoras() + " jogadoras");
        System.out.println("Jogando pela série "+this.getSerie());
    }
}
