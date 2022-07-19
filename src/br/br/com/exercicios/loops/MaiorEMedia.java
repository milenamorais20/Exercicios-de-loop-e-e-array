package br.br.com.exercicios.loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int soma = 0;
        int media;
        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero > maiorNumero){
                maiorNumero = numero;
            }

            soma = soma + numero;
            media = soma/5;

            count = count + 1;//Ou count++
        } while (count < 5);

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Média: " + media);
    }
}
