interface Pizza {
    double getPrice();
}

abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}

class PepperoniTopping extends PizzaDecorator {
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.5;
    }
}

class MushroomTopping extends PizzaDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.8;
    }
}
class Test6{
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new PepperoniTopping(pizza);
        pizza = new MushroomTopping(pizza);
        System.out.println("Price of the pizza with toppings: $" + pizza.getPrice());
    }
}

class PlainPizza implements Pizza {
    @Override
    public double getPrice() {
        return 5.0;
    }
}

