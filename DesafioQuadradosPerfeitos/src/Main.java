import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int resto;
        int contador;
        int valorTotal;
        int valor = 10000;

        int[] d = new int[n + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        valorTotal = valor;
        for (int i = d.length - 1; i > 0 && i <= n; i--) {

            if (i > 0 && d[i] > 0) {

                resto = n;
                contador = 0;

                for (int j = i; j > 0; j--) {

                    while (resto > 0) {
                        if (resto >= d[j]) {
                            resto = resto - d[j];
                            contador++;
                        } else {
                            j--;
                        }
                    }
                }
                if (valorTotal > contador) {
                    valorTotal = contador;
                }
            }
        }


        System.out.println(valorTotal);
    }
}
    //Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n.
// Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo.
// Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.