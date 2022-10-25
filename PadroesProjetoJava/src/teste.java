import padroes.Facade.Facade;
import padroes.Singleton.SingletonEager;
import padroes.Singleton.SingletonLazy;
import padroes.Singleton.SingletonLazyHolder;
import padroes.Strategy.*;

import java.awt.*;

public class teste {
    public static void main(String[] args) {

        //Singleton initialization
        SingletonLazy lazy = SingletonLazy.getInstancia(); //não instancia pelo new tem que pegar na classe.
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy initialization
        Comportameto normal = new ComportamentoNormal();
        Comportameto defensivo = new ComportamentoDefensivo();
        Comportameto agressivo = new ComportamentoAgressivo();
        Robo robot = new Robo();
        robot.setStrategy(normal); //polimorfismo do robo...
        robot.mover();
        robot.mover();
        robot.setStrategy(agressivo);//polimorfismo do robo...
        robot.mover();
        robot.mover();
        robot.mover();
        robot.setStrategy(defensivo);//polimorfismo do robo...
        robot.mover();
        robot.mover();
        robot.mover();
        robot.mover();

        //facade inicialization

        Facade facade = new Facade();

        facade.migrarCliente("Leandro", "445588747");

   }

}

