package lP1.matrizes.src.lP1.tarefas;

import java.util.Scanner;

public class licao4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, maior = 0, menor = 100, media = 0, soma = 0;
        int contMaior = 0, contMenor = 0, i;

        for(i = 0; i < 5; i++){
            System.out.println("Digite um número");
            num = scanner.nextInt();


            if( (num < 1) || (num > 100) ){
                i = i - 1;
            } else{

                soma = soma + num;


                if(num > maior){
                    maior = num;
                    contMaior++;
                }


                if(num < menor){
                    menor = num;
                    contMenor++;
                }

            }
        }

        System.out.println("O maior nº é: " + maior);
        System.out.println("O menor nº é: " + menor);
        System.out.println("A média foi: " + (media = soma / i));

    }
}
