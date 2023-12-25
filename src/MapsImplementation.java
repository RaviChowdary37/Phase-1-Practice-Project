import  java.util.*;
public class MapsImplementation {
    public static void main(String[] args) {
        // Creating a HashMap to store country names and their capitals
        Map<String, String> countryCapitalMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("UK", "London");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Germany", "Berlin");

        // Accessing elements in the map
        System.out.println("Capital of USA: " + countryCapitalMap.get("USA"));

        // Iterating through the map using keySet()
        System.out.println("\nIterating through the map using keySet():");
        for (String country : countryCapitalMap.keySet()) {
            String capital = countryCapitalMap.get(country);
            System.out.println("Country: " + country + ", Capital: " + capital);
        }

        // Removing an element from the map
        countryCapitalMap.remove("France");
        System.out.println("\nMap after removing France: " + countryCapitalMap);

        // Checking if a key exists in the map
        String country = "Germany";
        if (countryCapitalMap.containsKey(country)) {
            System.out.println("\n" + country + " exists in the map.");
        } else {
            System.out.println("\n" + country + " does not exist in the map.");
        }

        // Checking if a value exists in the map
        String capital = "London";
        if (countryCapitalMap.containsValue(capital)) {
            System.out.println(capital + " exists as a capital in the map.");
        } else {
            System.out.println(capital + " does not exist as a capital in the map.");
        }
    }
}
