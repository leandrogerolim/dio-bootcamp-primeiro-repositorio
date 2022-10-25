package padroes.Singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){ //contrutor
        super(); //chamada da classe pai
    }
    public static SingletonEager getInstance(){
      return instancia;

    }
}
