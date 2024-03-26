package Listas.L4.Ex4;

import static Listas.L4.Ex4.Jogo.jogo;

public class Main {
    public static void main(String[] args) {
        Coisa j1 = jogo();
        Coisa j2 = jogo();
        // JOptionPane.showInputDialog('')
        System.out.println(j1);
        System.out.println(j2);

        if (j1.ganhaDe(j2)) {
            System.out.println(j1 + " ganhou de " + j2);
        }

        else if (j2.ganhaDe(j1)) {
            System.out.println(j2+ " ganhou de " + j1);
        }

        else {
            System.out.println("Empatou");
        }
    }
}