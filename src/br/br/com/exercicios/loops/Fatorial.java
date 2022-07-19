package br.br.com.exercicios.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int i;
        int multiplicacao = 1;

        System.out.println("Digite qual fatorial deseja ver: ");
        num = scan.nextInt();

        for(i = num; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(num + "!" + " = " + multiplicacao);
    }
}
