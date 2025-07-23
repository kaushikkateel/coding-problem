package design_patterns.Decorator;

public class BasicPizza implements Pizza{

    @Override
    public String getToppings() {
        return "Cheese";
    }

    @Override
    public Integer getPrice() {
        return 150;
    }
}
