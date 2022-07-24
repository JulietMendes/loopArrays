package br.com.dio.arrays;
/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */
public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-4, -9, 8, 30, 40, 60};

        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1 ); i >= 0; i --){
            System.out.println(vetor[i] + " ");

        }

    }
}
