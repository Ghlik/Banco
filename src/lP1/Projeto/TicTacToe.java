package lP1.Projeto;

import java.util.*;

public class TicTacToe {
    public void jogoDavelha() {
        Scanner in = new Scanner(System.in);
        coluna = new String[9];
        jogada = "X";
        String vencedor = null;

        for (int a = 0; a < 9; a++) {
            coluna[a] = String.valueOf(a + 1);
        }

        System.out.println("Jogo da Velha");
        tabuleiro();

        System.out.println(
                "Jogador X, joga primeiro. Insira o espaço desejado para " + jogada + " no tabuleiro:");

        while (vencedor == null) {
            int numInput;

            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "Comando inválido; Insira o espaço desejado:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                        "Comando inválido; Insira o espaço desejado:");
                continue;
            }


            if (coluna[numInput - 1].equals(
                    String.valueOf(numInput))) {
                coluna[numInput - 1] = jogada;

                if (jogada.equals("X")) {
                    jogada = "O";
                }
                else {
                    jogada = "X";
                }

                tabuleiro();
                vencedor = verificarVencedor();
            }
            else {
                System.out.println(
                        "Este espaço ja está ocupado; insira o espaço desejado:");
            }
        }

        if (vencedor.equalsIgnoreCase("Velha")) {
            System.out.println("Que pena, deu velha");

            System.out.println("Deseja jogar novamente? Digite 1 para sim ou 0 para nao");
            int jogarNovamente = in.nextInt();
            if (jogarNovamente == 1) {
                jogoDavelha();
            }

        }

        else {
            System.out.println(
                    "Parabéns! " + vencedor + " Você ganhou!");

            System.out.println("Deseja jogar novamente? Digite 1 para sim ou 0 para nao");
            int jogarNovamente = in.nextInt();
            if (jogarNovamente == 1) {
                jogoDavelha();
            }
        }
        in.close();
    }
    static String[] coluna;
    static String jogada;

    static String verificarVencedor()
    {
        for (int a = 0; a < 8; a++) {
            String linha = null;

            switch (a) {
                case 0:
                    linha = coluna[0] + coluna[1] + coluna[2];
                    break;
                case 1:
                    linha = coluna[3] + coluna[4] + coluna[5];
                    break;
                case 2:
                    linha = coluna[6] + coluna[7] + coluna[8];
                    break;
                case 3:
                    linha = coluna[0] + coluna[3] + coluna[6];
                    break;
                case 4:
                    linha = coluna[1] + coluna[4] + coluna[7];
                    break;
                case 5:
                    linha = coluna[2] + coluna[5] + coluna[8];
                    break;
                case 6:
                    linha = coluna[0] + coluna[4] + coluna[8];
                    break;
                case 7:
                    linha = coluna[2] + coluna[4] + coluna[6];
                    break;
            }

            if (linha.equals("XXX")) {
                return "X";
            }

            else if (linha.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(coluna).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "Velha";
            }
        }

        System.out.println("Jogador " + jogada + " Insira o espaço desejado para " + jogada + " no tabuleiro:");
        return null;
    }

    static void tabuleiro()
    {
        System.out.println("|-----------|");
        System.out.println("| " + coluna[0] + " | "
                + coluna[1] + " | " + coluna[2]
                + " |");

        System.out.println("| " + coluna[3] + " | "
                + coluna[4] + " | " + coluna[5]
                + " |");

        System.out.println("| " + coluna[6] + " | "
                + coluna[7] + " | " + coluna[8]
                + " |");
        System.out.println("|-----------|");
    }

    public static void main(String[] args)
    {
        new TicTacToe().jogoDavelha();
    }
}