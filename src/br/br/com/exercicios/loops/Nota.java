package br.br.com.exercicios.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = scan.nextInt();

        while(true){
            switch (nota){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("A nota digitada foi: " + nota);
                    break;
                default:
                    System.out.println("Nota inválida. Digite novamente");
                    nota = scan.nextInt();
                    break;
            }
        }
    }

}
