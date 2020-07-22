package Decorator;

public class Milk extends CoffeeDecorator{

    public Milk(Coffee c) {
        super(c);
    }
    @Override
    public int getCost() {
        return super.getCost()+2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+" , "+"Milk";
    }
}
