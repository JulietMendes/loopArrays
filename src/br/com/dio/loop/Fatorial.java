package br.com.dio.loop;

import java.util.Scanner;

/*
Faça um prograama que calcule o fatorial de um número inteiro fornecido pelo usuário.
 */
public class Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");

        int fatorial = scan.nextInt();
        int multiplicacao= 1;

        System.out.println(fatorial+ "! = ");
        for (int i = fatorial; i >= 1; i = i - 1){

            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }

}
