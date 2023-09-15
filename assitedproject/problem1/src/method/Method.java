package method;

public class Method {
    // Method without parameters and without a return value (void)
    public static void sayHello() {
        System.out.println("Hello from sayHello method!");
    }

    // Method with parameters and a return value
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Call a method with no parameters
        sayHello();

        // Call a method with parameters and capture the return value
        int result = add(5, 3);
        System.out.println("Result of addition: " + result);

        // Call a method within a loop
        for (int i = 0; i < 3; i++) {
            sayHello();
        }
    }
}
