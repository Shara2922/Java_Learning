// ✅ CLASS & OBJECT Example

// A class is a blueprint for objects.
// An object is an instance of a class.

public class Student {
    // These are fields (also known as global or instance variables)
    String name;
    int age;

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Student
        Student s1 = new Student();
        s1.name = "Shara";
        s1.age = 20;

        // Calling method on the object
        s1.displayInfo();
    }
}
