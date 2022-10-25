package padroes.Singleton;
//apressado
public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private  SingletonLazyHolder(){ //contrutor
        super(); //chamada da classe pai
    }
    public static SingletonLazyHolder getInstance(){
           return InstanceHolder.instancia;

    }
}
