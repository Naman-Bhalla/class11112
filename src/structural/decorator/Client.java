package structural.decorator;

public class Client {

    public static void main(String[] args) {
        Pizza pizza =
                new SauceTopping(
                    new CheeseTopping(
                        new PaneerTopping(
                                new CheeseTopping(
                                        new PizzaBase()
                                )
                        )
                    )
                );
        System.out.println(pizza.getComposition());
        System.out.println(pizza.getCost());
    }
}

// HTML Parsers
// elemnet inside an element
// 4 design pattern