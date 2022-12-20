package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = "João";
        Carro carroDaBarbara = new Carro();

        int escolha;

        while (carroDaBarbara.isLigado){
            System.out.println();
            System.out.println("Escolha uma operação");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Estado atual");
            System.out.println("0 - Desligar");
            System.out.println("Operação: ");
            System.out.println();

            escolha = scan.nextInt();

            if (escolha == 0){
                carroDaBarbara.isLigado = false;
            } else if (escolha == 1){
                carroDaBarbara.velocidade +=10;
                System.out.printf("Você acelerou e sua velocidade atual é de? %dkm/h", carroDaBarbara.velocidade);
            } else if (escolha == 2){
                carroDaBarbara.velocidade -=10;
                System.out.printf("Você freiou e sua velocidade atual é de? %dkm/h", carroDaBarbara.velocidade);
            } else if (escolha == 3){
                    carroDaBarbara.velocidade +=10;
                    System.out.printf("O seu " + carroDaBarbara.marca + " " + carroDaBarbara.modelo + " esta atualmente a " + carroDaBarbara.velocidade);
            }

        }
        System.out.println("Você desligou o carro!");


    }
}
