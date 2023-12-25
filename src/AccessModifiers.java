
public class AccessModifiers {
    // Public class with public, protected, default, and private members

        public int publicVar = 10; // Public variable

        protected int protectedVar = 20; // Protected variable

        int defaultVar = 30; // Default (package-private) variable

        private int privateVar = 40; // Private variable

        // Public method accessible from anywhere
        public void publicMethod() {
            System.out.println("Public method");
        }

        // Protected method accessible within the same package and subclasses
        protected void protectedMethod() {
            System.out.println("Protected method");
        }

        // Default (package-private) method accessible within the same package
        void defaultMethod() {
            System.out.println("Default method");
        }

        // Private method accessible only within the same class
        private void privateMethod() {
            System.out.println("Private method");
        }
    public static void main(String[] args) {
            AccessModifiers example = new AccessModifiers();

        // Accessing public members and methods
        System.out.println("Public variable: " + example.publicVar);
        example.publicMethod();

        // Accessing protected members and methods
        System.out.println("Protected variable: " + example.protectedVar);
        example.protectedMethod();

        // Accessing default (package-private) members and methods
        System.out.println("Default variable: " + example.defaultVar);
        example.defaultMethod();

        // Accessing private members and methods - Not accessible outside the class
        // System.out.println("Private variable: " + example.privateVar); // This will cause a compilation error
        // example.privateMethod(); // This will cause a compilation error
    }
}
