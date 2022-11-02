import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {
            //TODO: Calcule o valor do fatorial de "n", atrinbuindo o retorno a "r".
            tmp *= n; //valor tmp *  tmp = n
            n--;

            if(n != 0){  //se n for diferente de zero
                tmp /= n; //tmp / tmp = n
                n--;
            }

            tmp += n;
            n--;

            res += tmp;

            tmp = -n;

            if (n == 1 ){
                res += tmp;
            }

            n--;
        }

        System.out.println(res);
    }
}