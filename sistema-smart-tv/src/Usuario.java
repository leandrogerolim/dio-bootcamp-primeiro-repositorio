public class Usuario {


        public static void main(String[] args) throws Exception {

        SmartTv smarTv = new SmartTv ();



            System.out.println("A TV está ligada ? " + smarTv.ligada);
            System.out.println("Qual é o canal atual ? " + smarTv.canal );
            System.out.println("qual é o volume atual ? " + smarTv.volume );

            smarTv.ligar();
            System.out.println("A TV está ligada ? " + smarTv.ligada);
            smarTv.desligar();
            System.out.println("A TV está ligada ? " + smarTv.ligada);



            smarTv.aumentarVolume();
            smarTv.aumentarVolume();
            smarTv.aumentarVolume();
            smarTv.aumentarVolume();
            System.out.println("qual é o volume atual ? " + smarTv.volume );
            smarTv.diminuirVolume();
            smarTv.diminuirVolume();
            System.out.println("qual é o volume atual ? " + smarTv.volume );

            smarTv.mudarCanal(13);
            System.out.println("Qual é o canal atual ? " + smarTv.canal );
            smarTv.aumentarCanal();
            System.out.println("Qual é o canal atual ? " + smarTv.canal );
            smarTv.diminuirCanal();
            smarTv.diminuirCanal();
            smarTv.diminuirCanal();
            smarTv.diminuirCanal();
            smarTv.diminuirCanal();
            System.out.println("Qual é o canal atual ? " + smarTv.canal );


        }
    }

