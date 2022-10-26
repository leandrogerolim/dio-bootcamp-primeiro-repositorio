import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        boolean caracter = ehValido(leitor.nextLine());

        System.out.println(caracter);

    }
    public static boolean ehValido(String s) {
        int somaDosChar = 0;

        boolean certo1 = false;
        boolean certo2;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (s.contains(")") && s.contains("(")) {
                somaDosChar = somaDosChar + 2;
            } else if (s.contains("{") && s.contains("}")) {
                somaDosChar = somaDosChar + 2;
            } else if (s.contains("[") && s.contains("]")) {
                somaDosChar = somaDosChar + 2;
            } else if (s.contains(" ") ) {
                somaDosChar = somaDosChar + 0;
            }
        }

        if (somaDosChar >= 2) {
            return true;
        } else {
            return false;
        }
    }
}







