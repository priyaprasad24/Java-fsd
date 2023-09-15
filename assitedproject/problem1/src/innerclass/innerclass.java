package innerclass;

public class innerclass {
    private int outerData = 10;

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("InnerClass: OuterData is " + outerData);
        }
    }

    // Static inner class
    static class StaticInnerClass {
        void display() {
            System.out.println("StaticInnerClass: This is a static inner class.");
        }
    }

    public static void main(String[] args) {
    	innerclass outerObj = new innerclass();
        
        // Create an instance of the inner class
        InnerClass innerObj = outerObj.new InnerClass();
        
        // Create an instance of the static inner class
        StaticInnerClass staticInnerObj = new StaticInnerClass();

        // Access members of inner class
        innerObj.display();

        // Access members of static inner class
        staticInnerObj.display();
    }
}
