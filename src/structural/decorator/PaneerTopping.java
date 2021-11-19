package structural.decorator;

public class PaneerTopping implements Pizza {
    Pizza pizza;

    PaneerTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public String getComposition() {
        return pizza.getComposition() + " + Paneer";
    }
}
