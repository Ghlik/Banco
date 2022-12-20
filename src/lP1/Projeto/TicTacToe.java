package lP1.Projeto;

import java.util.*;

public class TicTacToe {
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

}