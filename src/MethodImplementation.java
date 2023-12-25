public class MethodImplementation {

    // Instance method without parameters
    public static void  instanceMethodWithoutParams() {
        System.out.println("Inside instance method without parameters");
    }

    // Instance method with parameters
    public void instanceMethodWithParams(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    // Static method without parameters
    public static void staticMethodWithoutParams() {
        System.out.println("Inside static method without parameters");
    }

    // Static method with parameters
    public  void staticMethodWithParams(String message) {
        System.out.println("Message from static method: " + message);
    }

    // Main method to demonstrate calling different types of methods
    public static void main(String[] args) {

        MethodImplementation example = new MethodImplementation();

        // Calling instance methods using the object of the class
        example.instanceMethodWithParams(5, 7);

        //Calling instance method directly using class name.
        MethodImplementation.instanceMethodWithoutParams();

        //Calling static methods using the object of the class.
        example.staticMethodWithParams("Static method");


        // Calling static methods directly using class name
        MethodImplementation.staticMethodWithoutParams();


    }


}
