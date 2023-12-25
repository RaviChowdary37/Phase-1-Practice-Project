public class ConstructorImplementation {

    private int value;

    // Default constructor
    public ConstructorImplementation() {
        System.out.println("Inside default constructor");
        value = 0; // Initializing value to 0
    }

    // Parameterized constructor
    public ConstructorImplementation(int val) {
        System.out.println("Inside parameterized constructor");
        value = val; // Initializing value with the provided argument
    }

    // Constructor chaining by calling another constructor from within a constructor
    public ConstructorImplementation(int val1, int val2) {
        this(val1); // Calling parameterized constructor with a single argument
        System.out.println("Inside constructor chaining");
        value += val2; // Adding the second argument to the existing value
    }

    // Method to display the value
    public void displayValue() {
        System.out.println("Value is: " + value);
    }
    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorImplementation obj = new ConstructorImplementation();
        obj.displayValue();

        ConstructorImplementation obj1 = new ConstructorImplementation(5);
        obj.displayValue();

        ConstructorImplementation obj2 = new ConstructorImplementation(6,9);
        obj.displayValue();
    }
}
