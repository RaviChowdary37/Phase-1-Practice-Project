public class StringConversion {
    public static void main(String[] args) {
        // Create a String
        String originalString = "Hello, World!";

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Display the original String and converted StringBuffer and StringBuilder
        System.out.println("Original String: " + originalString);
        System.out.println("String to StringBuffer: " + stringBuffer);
        System.out.println("String to StringBuilder: " + stringBuilder);
    }
}
