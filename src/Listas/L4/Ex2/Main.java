package Listas.L4.Ex2;

import Listas.L3.Ex1.Cart;
import Listas.L3.Ex1.CartItem;
import Listas.L3.Ex1.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
        cartoes.add(new DiaDosNamorados("Joana"));
        cartoes.add(new Natal("Carlos"));
        cartoes.add(new Aniversario("Pedro"));

        for(CartaoWeb item: cartoes){
            item.showMessage();
        }
    }
}