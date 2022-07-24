package br.com.dio.loop;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e impares.
 */
public class ParImpar {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtdPar = 0;
        int qtdImpar = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int count = 0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) qtdPar++; // é igual a qtdPar = qtdPar + 1
            else qtdImpar++;

            count = count + 1;

        } while(count < qtdNumeros);

        System.out.println("Quantidade de númeoros pares: " + qtdPar);
        System.out.println("Quantidade de númeoros impares: " + qtdImpar);
    }
}
