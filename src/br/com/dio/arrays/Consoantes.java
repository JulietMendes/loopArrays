package br.com.dio.arrays;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int qtdConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Informe a Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
               letra.equalsIgnoreCase("e") |
               letra.equalsIgnoreCase("i") |
               letra.equalsIgnoreCase("o") |
               letra.equalsIgnoreCase("u") )){
                consoantes[count] = letra;
                qtdConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        // for each
        System.out.println("Consoantes: ");
        for ( String consoante :consoantes ) {
            if ( consoante != null)
                System.out.println(consoante + " ");
        }

        System.out.println("Quantidade de Consoantes: " + qtdConsoantes);
    }
}
