package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int somaNumero = 0;
        int contador = 1;


        do{
            System.out.println("Informe o  valor  " + contador);
            numero = scannner.nextInt();

            somaNumero = somaNumero + numero;
            if(numero > maiorNumero) maiorNumero= numero;
            contador ++;

        } while(contador <=5);
        int mediaNumero  = somaNumero / 5;

        System.out.println("O valor maior foi: " + maiorNumero );
        System.out.println("O valor de todos os número é: " + somaNumero );
        System.out.println("O valor da média de  todos os número é: " + mediaNumero );




    }
}

