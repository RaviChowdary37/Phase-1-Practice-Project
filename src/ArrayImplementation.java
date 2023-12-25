public class ArrayImplementation {
    public static void main(String[] args) {
        // Declaration and initialization of an array of integers
        int[] intArray = new int[5]; // Creating an array of size 5

        // Initializing array elements
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // Accessing array elements and displaying them
        System.out.println("Array elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // Declaration and initialization of an array of strings
        String[] stringArray = {"apple", "banana", "orange", "grape"};

        // Accessing and displaying string array elements
        System.out.println("\nString Array elements:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }

        // Multi-dimensional array (2D array) initialization
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Accessing and displaying 2D array elements
        System.out.println("\n2D Array elements:");
        for (int[] row : twoDArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
