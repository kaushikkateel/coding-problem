package design_patterns.Decorator;

public class DecoratorPattern {

    public static void main(String[] args)  {

        Pizza pizza = new BasicPizza();

        pizza = new Onion(pizza);
        pizza = new Paneer(pizza);
        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.getToppings() +" Total: "+ pizza.getPrice());
    }
}
