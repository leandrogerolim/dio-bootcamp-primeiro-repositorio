package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.


Mostre uma mensagem caso o valor seja inválido
e continue pedindo

até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;
        System.out.print("Insira a nota No intervalo de 0 - 10");
        nota = scanner.nextInt();


        while(true) {
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválido insira a nota no intervalo de 0 - 10: ");
                nota = scanner.nextInt();

            } else {
                System.out.println("A nota foi informada corretamente! Obrigado.");
                break;

            }

        }
       System.out.println("A nota informada foi: " + nota);

    }
}
