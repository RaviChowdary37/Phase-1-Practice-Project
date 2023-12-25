import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionImplementation {
    public static void main(String[] args) {
        // Define a regular expression pattern
        String regex = "\\bcat\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Define input text
        String text = "The cat is a domestic animal. A caterpillar can turn into a butterfly.";

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find matches using the regular expression
        System.out.println("Regular Expression Matches:");
        while (matcher.find()) {
            System.out.println("Match found at index " + matcher.start() + " to " + matcher.end() +
                    ": '" + matcher.group() + "'");
        }

        // Using replaceAll() method with regular expression
        String replacedText = text.replaceAll("\\bcat\\b", "dog");
        System.out.println("\nText after replacement:");
        System.out.println(replacedText);
    }
}
