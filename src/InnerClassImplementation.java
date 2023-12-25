public class InnerClassImplementation {

    private int outerVar = 10;

    // Member Inner Class
    class InnerClass {
        public void display() {
            System.out.println("Inside Member Inner Class");
            System.out.println("Outer variable accessed from Inner Class: " + outerVar);
        }
    }

    // Method with Local Inner Class
    public void localInnerClassMethod() {
        int localVar = 20;

        class LocalInner {
            public void display() {
                System.out.println("\nInside Local Inner Class");
                System.out.println("Local variable accessed from Local Inner Class: " + localVar);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    // Anonymous Inner Class
    interface Greeting {
        void greet();
    }

    public void anonymousInnerClassMethod() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("\nInside Anonymous Inner Class");
                System.out.println("Greetings from Anonymous Inner Class");
            }
        };

        greeting.greet();
    }

    // Static Nested Class
    static class StaticNestedClass {
        public void display() {
            System.out.println("\nInside Static Nested Class");
            // Outer class's non-static members are not accessible here.
        }
    }
    public static void main(String[] args) {


        InnerClassImplementation outer = new InnerClassImplementation();

        // Member Inner Class instantiation
        InnerClass inner = outer.new InnerClass();
        inner.display();

        // Local Inner Class invocation
        outer.localInnerClassMethod();

        // Anonymous Inner Class invocation
        outer.anonymousInnerClassMethod();

        // Static Nested Class instantiation
        StaticNestedClass staticNested = new StaticNestedClass();
        staticNested.display();
    }
}
