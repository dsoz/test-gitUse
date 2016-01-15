package ua.com.juja.patterns.strategy.classic;

/**
 * Created by oleksandr.baglai on 02.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Boolean input = new Boolean(true);
        Context context;

        // add
        context = new Context(new ConcreteStrategyA());
        System.out.println(context.method(input));

        context.setStrategy(new ConcreteStrategyB());
        System.out.println(context.method(input));

        context.setStrategy(new ConcreteStrategyC());
        System.out.println(context.method(input));
    }
}
