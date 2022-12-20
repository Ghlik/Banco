package tarefas;

import java.util.Scanner;

public class licao3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        double par = 0, imp = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número");
            num [i] = scanner.nextInt();
            if (num [i] % 2 == 0) {
                par++;
            }
            if (num [i] % 2 == 1) {
                imp++;
            }

            System.out.println(imp);

        }
    }
}