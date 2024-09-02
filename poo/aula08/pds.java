public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getDescription() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, and " + topping + " topping.";
    }
}

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder setDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        pizza.setSauce(sauce);
        return this;
    }

    public PizzaBuilder setTopping(String topping) {
        pizza.setTopping(topping);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public Waiter() {
        this.pizzaBuilder = new PizzaBuilder();
    }

    public Pizza takeOrder(String dough, String sauce, String topping) {
        return pizzaBuilder.setDough(dough).setSauce(sauce).setTopping(topping).build();
    }
}

// Demonstration
public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        Pizza hawaiianPizza = waiter.takeOrder("thin crust", "tomato", "ham and pineapple");
        System.out.println(hawaiianPizza.getDescription());

        Pizza spicyPizza = waiter.takeOrder("thick crust", "spicy tomato", "pepperoni and jalapenos");
        System.out.println(spicyPizza.getDescription());
    }
}