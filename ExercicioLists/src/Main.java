import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    //Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
    //
    //Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
    //mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2  //– Fevereiro e etc).
        public static void main(String[] args) {
        int i = 0;
        int count = 0;

        //para adicionar a temperatura por input...deixei ela fixa para poder testar mais rapido.
        //Scanner scan = new Scanner(System.in);
      //  while (true) {
       //     if (count == 6) break;
         //   System.out.print("Digite a temperatura: ");
         //   double temp = scan.nextDouble();
         //   temperaturas.add(temp);
        //    count++;
        //}

        List<Double> temperatura = new ArrayList<>();
        temperatura.add(33.0);
        temperatura.add(31.2);
        temperatura.add(32.4);
        temperatura.add(28.6);
        temperatura.add(24.8);
        temperatura.add(27.8);
        Double valorNovo = 0.0;

        for (i = 0; i < temperatura.size(); i++) {
            valorNovo = valorNovo + temperatura.get(i);
        }
        Double valorMedia = valorNovo / 6;


        System.out.println("Essas são as temperaturas: \n"+temperatura);
        System.out.println("Esse é o valor total das temperaturas: \n"+valorNovo);
        System.out.printf("Aqui está a médias dos 6 meses: %.2f  ",valorMedia);
        System.out.println("\nTemperaturas acima da média: ");
        temperatura.stream()
                .filter(t -> t > valorMedia)
                .forEach(t -> System.out.printf("%.1f ", t));

        System.out.println("\n\nMeses que estão com a  temperaturas acima da média: ");
        Iterator<Double> iterator = temperatura.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > valorMedia) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }

    }
}
