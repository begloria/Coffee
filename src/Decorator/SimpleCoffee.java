package Decorator;

public class SimpleCoffee extends Coffee{

    @Override
    public int getCost() {
        return 3;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
