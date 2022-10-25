package padroes.Singleton;

/**
 * Singleton "preguiçoso"
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){ //contrutor
        super(); //chamada da classe pai
    }
    public static SingletonLazy getInstancia(){
        if(instancia==null){
            instancia = new SingletonLazy();
        }
        return instancia;

    }
}
