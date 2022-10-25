package padroes.Strategy;

public class Robo {
    private Comportameto strategy;

    public void setStrategy(Comportameto strategy) {

        this.strategy = strategy;
    }
    public void mover(){
        strategy.mover();
    }
}
