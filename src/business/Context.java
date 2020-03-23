package business;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(String expr){
        return strategy.doOperation(expr);
    }
}
