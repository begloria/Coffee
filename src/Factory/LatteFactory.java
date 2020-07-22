package Factory;

import Decorator.Coffee;
import Decorator.Milk;
import Decorator.SimpleCoffee;

public class LatteFactory implements CoffeeFactory{

    @Override
    public Coffee makeCoffee() {
        return new Milk(new Milk(new SimpleCoffee()));
    }
}
