// ✅ ABSTRACTION

// Hides complexity by using abstract classes or interfaces.

abstract class Vehicle {
    // Abstract method - no body
    abstract void start();
}

class Car extends Vehicle {
    // Implement abstract method
    void start() {
        System.out.println("Car is starting...");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();  // Polymorphism + Abstraction
        v.start();
    }
}
