package repeticoes;

public class Tabuada {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
