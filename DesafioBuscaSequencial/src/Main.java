import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int X = leitor.nextInt();

       Main igual = new Main();

       igual.testarNumero(X);


    }

    int testarNumero;
    int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
    int i = 0;

    public void testarNumero(int X) {

        for (i = 0; i < elementos.length; i++) {

            if (elementos[i] == X) {
                System.out.println("Achei " + X + " na posição " + i);
                break;
            }

        }

        if (i >= elementos.length)
            System.out.println("Número " + X + " não encontrado!");
    }
}















