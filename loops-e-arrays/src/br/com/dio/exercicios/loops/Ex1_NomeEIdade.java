package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,

o primeiro representando o nome do aluno e o segundo representando a sua idade.

(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeAluno;
        int idadeAluno;

        while (true) {
            System.out.println("Insira o nome aluno: ");
            nomeAluno = scanner.next();
            if (nomeAluno.equals("0"))break;  //sem o break ele continua no loop
            System.out.println("Agora a idade aluno: ");
            idadeAluno = scanner.nextInt();

        }
        System.out.println("***** O número 0 foi selecionado e encerrou o programa ***** \n Obrigado!!!");
        }



    }


