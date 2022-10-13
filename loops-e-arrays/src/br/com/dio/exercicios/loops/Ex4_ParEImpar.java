package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumero = 0;

        System.out.println("Informe a quantidade de números desejados");
        quantidadeNumero = scanner.nextInt();

        int numero = quantidadeNumero;
        int numeroSomar = 0 ;
        int contador = 1;
        int numeroPar = 0;
        int numeroImpar = 0;

       while(true) {
            if (contador <= numero) {
                System.out.println("informe o número de posição " + contador);
                numeroSomar = scanner.nextInt();
                contador ++;
                if (numeroSomar % 2 == 0){
                    numeroPar ++;

                }else{
                    numeroImpar++;
                }

            }else{
                System.out.println("fim dos números. ");

                System.out.println("quantidade de numeros par: "+ numeroPar);

                System.out.println("quantidade de numeros Impar: " + numeroImpar);
                break;
            }

        }






    }
}
