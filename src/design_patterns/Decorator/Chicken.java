package design_patterns.Decorator;

public class Chicken extends Toppings{

    public Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getToppings() {
        return this.pizza.getToppings() + ", Chicken";
    }

    @Override
    public Integer getPrice() {
        return  this.pizza.getPrice() + 60;
    }
}
