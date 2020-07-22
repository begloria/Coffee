package Decorator;

public abstract class CoffeeDecorator extends Coffee{
    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee c){
        this.decoratedCoffee=c;
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
