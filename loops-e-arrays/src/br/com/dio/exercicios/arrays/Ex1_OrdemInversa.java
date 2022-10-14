package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] numeroInverso = {5, 2,8,61,88,48};
        int contador = 0;



        System.out.println(numeroInverso.length);
        while(contador < numeroInverso.length){
            System.out.println(numeroInverso[contador]);
            contador++;

        }
        for (int i = (numeroInverso.length - 1); i >= 0; i--){
            System.out.println(numeroInverso[i]);

        }





    }
}
