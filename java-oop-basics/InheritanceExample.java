// ✅ INHERITANCE

// Inheritance allows a class to acquire properties/methods of another class.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        // Inherited method
        d.sound();

        // Child class method
        d.bark();
    }
}
