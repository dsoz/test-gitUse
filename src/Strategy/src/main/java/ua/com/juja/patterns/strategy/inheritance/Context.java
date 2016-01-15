package ua.com.juja.patterns.strategy.inheritance;

/**
 * Created by oleksandr.baglai on 02.09.2015.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Object method(Object input) {
        return String.format("Object: %s, %s", input, strategy.algorithm(input));
    }
}
