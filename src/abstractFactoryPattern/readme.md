### **Factory Pattern vs Abstract Factory Pattern**

Both **Factory Pattern** and **Abstract Factory Pattern** are **creational design patterns**, but they differ in their use cases and implementation.

---

## **1. Factory Pattern**
Factory Pattern provides a way to instantiate objects from a **single family of classes** without exposing the instantiation logic.

### **Example: Simple Factory Pattern**
Imagine you have different types of cars (`Sedan`, `SUV`), and you create them using a `CarFactory`.

```java
// Step 1: Create an interface
interface Car {
    void drive();
}

// Step 2: Implement concrete classes
class Sedan implements Car {
    public void drive() {
        System.out.println("Driving a Sedan!");
    }
}

class SUV implements Car {
    public void drive() {
        System.out.println("Driving an SUV!");
    }
}

// Step 3: Factory class to create objects
class CarFactory {
    public static Car getCar(String type) {
        if (type.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (type.equalsIgnoreCase("SUV")) {
            return new SUV();
        }
        return null;
    }
}

// Step 4: Client code
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("Sedan");
        car1.drive();

        Car car2 = CarFactory.getCar("SUV");
        car2.drive();
    }
}
```
🔹 **Key Points:**
- The **Factory class (`CarFactory`)** decides which class to instantiate.
- The client does not create objects directly.

---

## **2. Abstract Factory Pattern**
Abstract Factory provides an interface for creating families of related objects **without specifying their concrete classes**.

### **Example: Abstract Factory Pattern**
Now, let’s say we need **both Cars and Bikes**, and we want to produce **Luxury and Economy versions**.

```java
// Step 1: Abstract Product Interfaces
interface Car {
    void drive();
}

interface Bike {
    void ride();
}

// Step 2: Concrete Product Implementations
class LuxuryCar implements Car {
    public void drive() {
        System.out.println("Driving a Luxury Car!");
    }
}

class EconomyCar implements Car {
    public void drive() {
        System.out.println("Driving an Economy Car!");
    }
}

class LuxuryBike implements Bike {
    public void ride() {
        System.out.println("Riding a Luxury Bike!");
    }
}

class EconomyBike implements Bike {
    public void ride() {
        System.out.println("Riding an Economy Bike!");
    }
}

// Step 3: Abstract Factory Interface
interface VehicleFactory {
    Car createCar();
    Bike createBike();
}

// Step 4: Concrete Factories
class LuxuryVehicleFactory implements VehicleFactory {
    public Car createCar() {
        return new LuxuryCar();
    }
    public Bike createBike() {
        return new LuxuryBike();
    }
}

class EconomyVehicleFactory implements VehicleFactory {
    public Car createCar() {
        return new EconomyCar();
    }
    public Bike createBike() {
        return new EconomyBike();
    }
}

// Step 5: Factory Producer (Factory of Factories)
class FactoryProducer {
    public static VehicleFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Luxury")) {
            return new LuxuryVehicleFactory();
        } else if (choice.equalsIgnoreCase("Economy")) {
            return new EconomyVehicleFactory();
        }
        return null;
    }
}

// Step 6: Client Code
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        VehicleFactory luxuryFactory = FactoryProducer.getFactory("Luxury");
        Car luxuryCar = luxuryFactory.createCar();
        Bike luxuryBike = luxuryFactory.createBike();
        luxuryCar.drive();
        luxuryBike.ride();

        VehicleFactory economyFactory = FactoryProducer.getFactory("Economy");
        Car economyCar = economyFactory.createCar();
        Bike economyBike = economyFactory.createBike();
        economyCar.drive();
        economyBike.ride();
    }
}
```

🔹 **Key Points:**
- The **Abstract Factory (`VehicleFactory`)** defines how related objects are created.
- **Concrete Factories (`LuxuryVehicleFactory`, `EconomyVehicleFactory`)** implement this factory interface.
- The **Factory Producer (`FactoryProducer`)** provides the correct factory based on the need.

---

## **🚀 Key Differences**
| Feature              | Factory Pattern                        | Abstract Factory Pattern                  |
|----------------------|--------------------------------------|------------------------------------------|
| **Purpose**          | Creates objects from a single hierarchy | Creates families of related objects |
| **Level of Abstraction** | Single Factory for object creation | Factory of Factories (produces multiple related factories) |
| **Flexibility**      | Less flexible (tightly coupled to one hierarchy) | More flexible (allows multiple product families) |
| **Example**          | Car Factory (`Sedan`, `SUV`)         | Vehicle Factory (`LuxuryCar`, `LuxuryBike`) |

---

## **🔥 When to Use Which?**
- Use **Factory Pattern** when you only need to create **one type of object**.
- Use **Abstract Factory Pattern** when you need to create **multiple related objects** together.

Would you like a **real-world example** like **database drivers, UI themes, or cloud services**? 🚀