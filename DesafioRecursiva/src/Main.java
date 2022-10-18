import java.util.*;
public class Main {
    public static void main(String[] args) {
        int N = 0;

        Scanner leitor = new Scanner(System.in);


       N = (leitor.nextInt());

        System.out.println(somatorio(N));

    }
/**
 * Método útil que calcula o somatório de um número usando recursividade.
 */
        static int somatorio ( int N){
            if (N == 0) {
                return 0;
            } else {
                return N + somatorio(N - 1);
            }

        }

    }
