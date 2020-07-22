package Decorator;

public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee c) {
        super(c);
    }
    @Override
    public int getCost() {
        return super.getCost()+1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+" , "+"Sugar";
    }
}
