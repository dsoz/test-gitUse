package ua.com.juja.patterns.decorator.sample;

/**
 * Created by oleksandr.baglai on 26.08.2015.
 */
public class Milk extends Additive {

    public Milk(Beverage component) {
        super(component);
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }

    @Override
    public String description() {
        return super.description() + "Milk";
    }
}
