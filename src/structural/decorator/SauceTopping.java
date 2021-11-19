package structural.decorator;

public class SauceTopping implements Pizza {
    Pizza pizza;

    SauceTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getComposition() {
        return pizza.getComposition() + " + Sauce";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 10;
    }
}
