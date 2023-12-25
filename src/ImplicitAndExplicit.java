public class ImplicitAndExplicit {
    public static void main(String[] args) {
        // Implicit Typecasting
        int numInt = 100;
        long numLong = numInt; // Implicit casting from int to long
        float numFloat = numInt; // Implicit casting from int to float
        double numDouble = numFloat; // Implicit casting from float to double

        System.out.println("Implicit Typecasting:");
        System.out.println("Integer value: " + numInt);
        System.out.println("Long value after implicit casting from int: " + numLong);
        System.out.println("Float value after implicit casting from int: " + numFloat);
        System.out.println("Double value after implicit casting from float: " + numDouble);

        // Explicit Typecasting
        double bigDouble = 1234.56;
        int smallInt = (int) bigDouble; // Explicit casting from double to int

        System.out.println("\nExplicit Typecasting:");
        System.out.println("Double value: " + bigDouble);
        System.out.println("Int value after explicit casting from double: " + smallInt);
    }
}
