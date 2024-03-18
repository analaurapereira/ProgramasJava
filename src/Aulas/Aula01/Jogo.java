package Aulas.Aula01;

import java.util.Random;

public class Jogo {
    public Time desafiante;
    public Time desafiado;
    private boolean aprovada;

    public void marcarJogos(Time t1, Time t2){
        if(t1.getSerie().equals(t2.getSerie()) && t1 != t2){
            this.aprovada = true;
            this.desafiado = t1;
            this.desafiante = t2;
        }

        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void jogar(){
        if(this.aprovada){
            System.out.println("---- Desafiante ----");
            this.desafiante.apresentar();
            System.out.println("---- Desafiado ----");
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch(vencedor){
                case 0://empate
                    System.out.println("EMPATOU!");
                    break;

                case 1://desafiado vence
                    System.out.println("Venceu " + this.desafiado.getNome());
                    break;

                case 2://desafiante vence
                    System.out.println("Venceu " + this.desafiante.getNome());
                    break;
            }
        }

        else{
            System.out.println("A luta não pode acontecer");
        }
    }
}
