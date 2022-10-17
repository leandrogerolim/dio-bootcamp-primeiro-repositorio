import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int A;
        int B;

        System.out.println("A");
        A = leitor.nextInt();


        System.out.println("B");
        B = leitor.nextInt();

        if(A == (B)){
            System.out.println("São iguais!" );
        }else{
            System.out.println("Não são iguais!");
        }
    }

}