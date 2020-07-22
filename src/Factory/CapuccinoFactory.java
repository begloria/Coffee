package Factory;

import Decorator.Coffee;
import Decorator.Milk;
import Decorator.SimpleCoffee;

public class CapuccinoFactory implements CoffeeFactory{

    @Override
    public Coffee makeCoffee() {
        return new Milk(new SimpleCoffee());
    }
}
