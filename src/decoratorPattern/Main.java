package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        Beverage coffeeWithMilk = new Milk(coffee);
        System.out.println(coffeeWithMilk.getDescription() + " $" + coffeeWithMilk.cost());

        Beverage coffeeWithMilkAndSugar = new Sugar(coffeeWithMilk);
        System.out.println(coffeeWithMilkAndSugar.getDescription() + " $" + coffeeWithMilkAndSugar.cost());
    }
}


interface Beverage {
    String getDescription();
    double cost();
}

class Coffee implements Beverage {
    public String getDescription() {
        return "Coffee";
    }

    public double cost() {
        return 1;
    }
}

abstract class CoffeeDecorator implements Beverage {
    protected Beverage beverage;

    public CoffeeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription();
    }

    public double cost() {
        return beverage.cost();
    }
}

class Milk extends CoffeeDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 2;
    }
}

class Sugar extends CoffeeDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public double cost() {
        return beverage.cost() + 3;
    }
}