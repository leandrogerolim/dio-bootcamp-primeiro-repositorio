import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

        List<String> respostas = new ArrayList<>(); //instanciando a list
        Scanner scanner = new Scanner(System.in); //scanner para preencher a list
        System.out.println("Responda as seguintes perguntas com SIM ou NÂO: ");
        System.out.println("Perguntas: ");

        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next(); //recebe a informação pelo scanner
        respostas.add(resposta.toLowerCase());// trasnforma qualquer resposta em lowercase (letra minuscula)
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());//teria que obrigar o usuario a responder com um termo correto SIM - não   1 para sim 2 para não

        System.out.println(respostas); //imprime a lista para possivel conferencia

        int count = 0;
        Iterator<String> contador = respostas.iterator(); //percorrer a lista
        while(contador.hasNext()){ //percorre a lista e o has next pergunta se tem um proximo  posição
            String resp = contador.next();
            if(resp.contains("s")) {  //caso na resp tenha a letras S o count soma + 1
                count ++;
            }
        }

        switch(count) {  //conforme o count foi somando ele chegou em um resultado  2 - 3 - 4 depende da quantidade de respostas
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}