package br.com.dio.loop;

/*
Gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro de 0 a 10.
O usuário deve informar deve informar de qual número ele deseja ver a tabuada.
 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++) { // i++ é igual a i = i + 1
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
