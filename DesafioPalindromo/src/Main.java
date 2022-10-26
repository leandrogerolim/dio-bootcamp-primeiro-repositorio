import java.util.Scanner; //import do scanner

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //instancia o leitor para scannner
        String palavra = leitor.nextLine(); //recebe a palavra para fazer a comparação dentro da variavel "palavra"
        String aoContrario =""; //variavel que vai receber a palavra ao contrario...é instanciada vazio...
        int valorTotal; //recebe o tamanho da palavra digitada .length.
        int i; //utilizada no for para receber o contador.

        valorTotal=palavra.length(); //no caso da palavra radar o valorTotal fica com o valor de "5"

                                            //no caso se a palavra for radar
        for(i=valorTotal-1;i>=0;i--){ //loop for **** i = valorTotal(5) menos 1 ; i maior ou igual a zero ; i menos 1
        aoContrario += palavra.charAt(i); //aqui a variavel aoContrario esta reecebendo ela mesmo mais o caracter indicado
            //na charAt no caso radar a cada loop do for ela recebe uma letra
            //aoContrario PRIMEIRO loop = receber a letra de posiçao 5 = R
            //aoContrario SEGUNDO loop = receber a letra de posiçao 4 = A
            //aoContrario TERCEIRO loop = receber a letra de posiçao 3 = D
            //aoContrario QUARTO loop = receber a letra de posiçao 2 = A
            //aoContrario QUINTO loop = receber a letra de posiçao 1 = R


        }

        if(palavra.equals(aoContrario)){ ///utiliza o equal para comparar o objeto inteiro...não somente o valor igual quando usa o ==.
            System.out.println("TRUE"); //se a palava for igual a aoContrario TRUE
        }else{ // se não FALSE.
            System.out.println("FALSE");
        }

    }

    }
