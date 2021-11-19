package structural.decorator;

public class PizzaBase implements Pizza {

    PizzaBase() {}

    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getComposition() {
        return "Pizza Base";
    }
}
