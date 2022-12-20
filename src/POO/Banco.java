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

        Conta contaExemplo = new Conta();

        contaExemplo.saldo = 12000;

        contaExemplo.numConta = "8569";
        contaExemplo.agencia = "02";

        Cliente usuario = new Cliente();

        usuario.nome = "Pedro Guilherme";
        usuario.categoriaPerfil = "Gold";

        usuario.conta = contaExemplo;

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
            System.out.println();

            if (escolha == 1){
                System.out.println("Você sacou R$500 da sua conta, seu novo saldo é: " + (contaExemplo.saldo -= 500));

            } else if (escolha == 2) {
                System.out.println("Você depositou R$500 da sua conta, seu novo saldo é:" + (contaExemplo.saldo += 500));

            } else if (escolha == 3) {
                System.out.println("Seu saldo é:" + contaExemplo.saldo);
            }
        }
    }
}
