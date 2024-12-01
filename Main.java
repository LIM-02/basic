import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize arrayA
        List<String> arrayA = new ArrayList<>(Arrays.asList("Honda", "Toyota", "Proton"));

        // Step 2: Add "Nissan" to arrayA and print it
        arrayA.add("Nissan");
        System.out.println("After adding 'Nissan': " + arrayA);

        // Step 3: Add "Mazda" as the first element and print it
        arrayA.add(0, "Mazda");
        System.out.println("After adding 'Mazda' as the first element: " + arrayA);

        // Step 4: Create arrayB and combine with arrayA
        List<String> arrayB = Arrays.asList("Cat", "Dog", "Elephant");
        arrayA.addAll(arrayB);
        System.out.println("Combined arrayA: " + arrayA);

        // Step 5: Initialize mapC and mapD
        Map<String, String> mapC = new HashMap<>();
        mapC.put("123", "Justin");
        mapC.put("456", "Owen");
        mapC.put("789", "Hugo");

        Map<String, String> mapD = new HashMap<>();
        mapD.put("123", "George");
        mapD.put("555", "Jack");
        mapD.put("888", "Julian");

        // Step 6: Combine mapD into mapC and print it
        mapC.putAll(mapD);
        System.out.println("Combined mapC: " + mapC);

        // Step 7: Explain why "Justin" is no longer in mapC
        System.out.println("Reason: The key '123' in mapC was overwritten by the value from mapD.");

        // Step 8: Return values in mapC where the key contains "5"
        System.out.println("Values where key contains '5':");
        mapC.forEach((key, value) -> {
            if (key.contains("5")) {
                System.out.println("Key: " + key + ", Value: " + value);
            }
        });

        // Step 9: Remove entries where the value contains "o" (ignore case)
        mapC.entrySet().removeIf(entry -> entry.getValue().toLowerCase().contains("o"));

        // Step 10: Reverse the string and assign it back to str
        String str = "111222888222555";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedStr);

        // Step 11: Replace the last occurrence of "222" with "aaa"
        final String TARGET_SUBSTRING = "222";       // The substring to find and replace
        final String REPLACEMENT_SUBSTRING = "aaa";  // The substring to replace with
        final int SUBSTRING_LENGTH = TARGET_SUBSTRING.length(); // Length of the target substring

        int lastIndex = reversedStr.lastIndexOf(TARGET_SUBSTRING);

        // Check if "222" exists in the string
        if (lastIndex != -1) {
            str = reversedStr.substring(0, lastIndex)
                    + REPLACEMENT_SUBSTRING
                    + reversedStr.substring(lastIndex + SUBSTRING_LENGTH);
        }

        System.out.println("After replacing last '" + TARGET_SUBSTRING + "' with '" + REPLACEMENT_SUBSTRING + "': " + str);
    }
}
