import  java.util.*;
public class CollectionsImplementation {
    public static void main(String[] args) {
        // ArrayList example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList elements: " + arrayList);

        // LinkedList example
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList elements: " + linkedList);

        // HashMap example
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Alice");
        hashMap.put(3, "Bob");
        System.out.println("HashMap elements: " + hashMap);

        // HashSet example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        System.out.println("HashSet elements: " + hashSet);
    }
}
