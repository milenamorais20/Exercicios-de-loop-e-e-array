package br.br.com.exercicios.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int i;

        System.out.println("Digite qual tabuada deseja ver: ");
        num = scan.nextInt();

        for(i = 1; i <= 10; i++){
            if(num <= 10){
                int tabuada = num * i;
                System.out.println(num + "x" + i + " = " + tabuada);
            }
            else {
                System.out.println("Digite um número válido");
                num = scan.nextInt();
            }
        }
    }
}
