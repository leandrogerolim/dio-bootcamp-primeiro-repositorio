import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int i;
        int temporaria;
        int N = leitor.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) {
            nums[i] = leitor.nextInt();
        }
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares


        int[] ordenacao = new int[N];

        for (i = 0; i < N; i++)
        if (nums[i] % 2 != 0) {

            for (int j = (i + 1); j < N; j++) {
                if (nums[j] % 2 == 0) {
                    temporaria = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temporaria;
                    j = N;

                }
            }

//           for (i = 0; i < N; i++) {
//               if (nums[i] % 2 != 0) {
//                   for (int j = 0; j < N; j++) {
//                       if (ordenacao[j] == 0) {
//                           ordenacao[j] = nums[i];
//                            break;
//                       }
//
//                   }
//              }
//
         }
            for (i = 0;i< N; i++) {
                System.out.println(nums[i]);
            }

        }
    }


