package design_patterns.Decorator;

public class Paneer extends Toppings{

    public Paneer(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getToppings() {
        return this.pizza.getToppings() + ", Paneer";
    }

    @Override
    public Integer getPrice() {
        return  this.pizza.getPrice() + 60;
    }
}
