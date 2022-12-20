package POO;

import java.util.Scanner;

public class Banco {

    /**
     * Projeto caixa Eletronico
     *
     * - Cliente (3 atributos) e Conta (3 atributos)
     *
     * - Sacar, depositar e consultar saldo
     *
     *
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Conta c1 = new Conta();

        c1.saldo = 12000;

        c1.numConta = "8569";
        c1.agencia = "02";

        Cliente usuario = new Cliente();

        usuario.nome = "Pedro Guilherme";
        usuario.categoriaPerfil = "Gold";

        usuario.conta = c1;

        int escolha = -1;

        while(escolha != 0){
            System.out.println();
            System.out.println("Digite o valor da operção desejada");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Finalizar sessão.");
            System.out.print("Realizar operação: ");
            escolha = scan.nextInt();

            if (escolha == 1){
                System.out.println("Você sacou R$500 da sua conta, seu novo saldo é: " + (c1.saldo -= 500));

            } else if (escolha == 2) {
                System.out.println("Você depositou R$500 da sua conta, seu novo saldo é:" + (c1.saldo += 500));

            } else if (escolha == 3) {
                System.out.println("Seu saldo é:" + c1.saldo);
            }
        }
}
}
