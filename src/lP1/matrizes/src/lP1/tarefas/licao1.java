package lP1.matrizes.src.lP1.tarefas;

import java.util.Scanner;

public class licao1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] frutas = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("adicione uma fruta ao carrinho");
            frutas[i] = scanner.nextLine();
        }
        System.out.println("Estas são as frutas no carrinho:");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
    }
}