package Factory;

import Decorator.Coffee;
import Decorator.SimpleCoffee;

public class ExpressoFactory implements CoffeeFactory{

    @Override
    public Coffee makeCoffee() {
        return new SimpleCoffee();
    }
}
