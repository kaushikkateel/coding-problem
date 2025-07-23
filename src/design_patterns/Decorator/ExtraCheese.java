package design_patterns.Decorator;

public class ExtraCheese extends Toppings {

    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getToppings() {
        return this.pizza.getToppings() + ", ExtraCheese";
    }

    @Override
    public Integer getPrice() {
        return this.pizza.getPrice() + 30;
    }
}