package constructor;

public class Constructor {
    // Default constructor (no arguments)
    public Constructor() {
        System.out.println("Default Constructor: This is a default constructor.");
    }

    // Parameterized constructor with one argument
    public Constructor(int value) {
        System.out.println("Parameterized Constructor (int): Value is " + value);
    }

    // Parameterized constructor with two arguments
    public Constructor(String name, int age) {
        System.out.println("Parameterized Constructor (String, int): Name is " + name + ", Age is " + age);
    }

    public static void main(String[] args) {
        // Create instances of the class using different constructors
        Constructor defaultConstructor = new Constructor();
        Constructor intConstructor = new Constructor(42);
        Constructor stringIntConstructor = new Constructor("Alice", 30);
    }
}

