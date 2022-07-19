package br.br.com.exercicios.arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};//É assim que se declara um vetor unidimensional, já setado com os elementos dentro

        //System.out.println(vetor.length); Mostra a quantidade de objs dentro do array

        System.out.println("Vetor: ");
        int count = 0;
        while(count < vetor.length){// Vai executar esse programa enquanto count for menor do que a quatidade de arrays
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length-1); i >= 0; i--){//i = vetor... pois vai ser decrescente
            System.out.println(vetor[i] + " ");
        };
    }
}
