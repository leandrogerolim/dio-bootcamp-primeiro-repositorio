package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroInformado = 0;
        int contador = 1;
        System.out.println("informe qual numero da tabuada você deseja saber o intervalo deve ser entre 1 - 10");
        numeroInformado = scan.nextInt();


        do {


            if (numeroInformado <= 1 || numeroInformado >= 10) {
                while (numeroInformado <= 1 || numeroInformado >= 10) {
                    System.out.println("O número Informado é inválido digite novamente no intervalo entre 1-10: ");
                    numeroInformado = scan.nextInt();
                }
            }
            int valorTotal = contador * numeroInformado;

            System.out.println(contador + " x " + numeroInformado + " = " + valorTotal);
            contador++;

        }while (contador <= 10) ;

                System.out.println("Programa foi executado com sucesso! o número escolhido foi: " + numeroInformado);

        }
    }



