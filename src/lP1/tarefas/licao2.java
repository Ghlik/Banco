package tarefas;

import java.util.Scanner;

public class licao2 {

        public static String reverse (String o) {
            String temporaria = "";
            for (int i = o.length() - 1; i >= 0; i--)
                temporaria += o.charAt(i);
            return temporaria;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o que deseja inverter");

        String escrita = scanner.nextLine();
        licao2 string = null;
        System.out.println(string.reverse(escrita));
    }
}
