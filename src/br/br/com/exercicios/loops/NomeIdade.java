package br.br.com.exercicios.loops;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;//Esse equals, quebra o loop do while e pula para linha "continua aqui"

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continua aqui...");
    }
}
