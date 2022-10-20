import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        boolean fizz = num % 3 == 0;
        boolean buzz = num % 5 == 0;
        boolean fizzbuzz = fizz && buzz;


        if (fizzbuzz) {
            System.out.println("FizzBuzz");


        } else if

        (buzz ) {
            System.out.println("Buzz");

        }else if(fizz) {
            System.out.println("Fizz");

        }else {


            System.out.println(num);


        }

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

    }
}


