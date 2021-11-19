package structural.decorator;

public class CheeseTopping implements Pizza {
    Pizza pizza;

    CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getComposition() {
        return pizza.getComposition() + " + Cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
}
