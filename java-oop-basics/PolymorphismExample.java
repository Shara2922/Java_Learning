// ✅ POLYMORPHISM

// One method behaves differently depending on the object type.

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal a = new Cat();  // Polymorphism

        // Calls overridden method of Cat
        a.makeSound();
    }
}
