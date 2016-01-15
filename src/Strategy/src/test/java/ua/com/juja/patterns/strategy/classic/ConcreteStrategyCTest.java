package ua.com.juja.patterns.strategy.classic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 02.09.2015.
 */
public class ConcreteStrategyCTest {

    private Strategy strategy = new ConcreteStrategyC();

    @Test
    public void test() {
        assertEquals("class:String", strategy.algorithm("String"));
        assertEquals("class:Boolean", strategy.algorithm(true));
        assertEquals("class:Double", strategy.algorithm(7.6));
    }
}
