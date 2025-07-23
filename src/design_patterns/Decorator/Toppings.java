package design_patterns.Decorator;

public class Toppings implements Pizza{

    protected Pizza pizza;

    public Toppings(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getToppings() {
        return this.pizza.getToppings();
    }

    @Override
    public Integer getPrice() {
        return  this.pizza.getPrice();
    }

}
