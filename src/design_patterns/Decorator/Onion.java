package design_patterns.Decorator;

public class Onion extends Toppings{

    public Onion(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getToppings() {
        return this.pizza.getToppings() + ", Onion";
    }

    @Override
    public Integer getPrice() {
        return  this.pizza.getPrice() + 20;
    }
}
