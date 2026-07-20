
import java.util.HashMap;
import java.util.Map;

/**
 * Data Structures Lab 3: Map - Word Frequency Counter
 *
 * This lab demonstrates how HashMap works through word frequency analysis.
 * You'll learn about: - Creating and initializing maps - Adding key-value pairs
 * (put, putIfAbsent) - Accessing values (get, getOrDefault) - Checking for keys
 * and values (containsKey, containsValue) - Updating values (put, replace) -
 * Iterating through maps (keySet, values, entrySet) - Map properties (size,
 * isEmpty)
 *
 * Instructions: 1. Read each section carefully 2. Uncomment the code blocks
 * marked with TODO 3. Fill in any missing variable names or method calls 4. Run
 * the program and observe how key-value pairs work
 */
public class MapLab {

    public static void main(String[] args) {
        System.out.println("=== WORD FREQUENCY COUNTER ===");
        System.out.println("Learning HashMap operations through text analysis\n");

        // Sample text for analysis
        String text = """
                      Java is a versatile, object-oriented programming language widely used for building web, 
                      desktop, and mobile applications. Its syntax is similar to C++, making it familiar to 
                      many developers. Java runs on the Java Virtual Machine (JVM), which allows code to be 
                      compiled once and run anywhere. It supports features like encapsulation, inheritance, 
                      and polymorphism, making it ideal for large-scale software development. Common Java tools
                      include Eclipse, IntelliJ, and Maven. Developers often use Java for Android app development, 
                      backend services, and enterprise applications. Its vast library support and strong community 
                      make Java a reliable choice for both beginners and professionals alike.
                   
                      """;

        System.out.println("Text to analyze: \"" + text + "\"");
        System.out.println();

        // ========== SECTION 1: Creating the Map ==========
        System.out.println("1. Creating a word frequency map...");

        // TODO: Create a Map with String keys and Integer values called wordFrequency
        // Use HashMap class as the implementation
        Map<String, Integer> wordFrequency = new HashMap<>();

        System.out.println("   HashMap created successfully!");
        System.out.println("   Map size: " + wordFrequency.size());
        System.out.println("   Is empty: " + wordFrequency.isEmpty());
        System.out.println();

        // ========== SECTION 2: Processing Text into Words ==========
        System.out.println("2. Processing text into individual words...");

        // TODO: Split the text into words using split(" ") method
        // Store the result in a String array called words
        String[] words = text.split(" ");

        System.out.println("   Total words found: " + words.length);
        System.out.println("   Words array: ");
        for (String word : words) {
            System.out.print("'" + word + "' ");
        }
        System.out.println("\n");

        // ========== SECTION 3: Counting Word Frequencies ==========
        System.out.println("3. Counting word frequencies...");

        // TODO: Create a for-each loop to count word frequencies
        // For each word in the words array:
        // 1. Get the current count using getOrDefault(word, 0)
        // 2. Put the word back with count + 1
        //  you can also Use the pattern: 
        // wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("   Word frequencies calculated!");
        System.out.println("   Map size: " + wordFrequency.size());
        System.out.println("   Current map: " + wordFrequency);
        System.out.println();

        // ========== SECTION 4: Accessing Specific Word Frequencies ==========
        System.out.println("4. Checking frequencies of specific words...");

        String searchWord = "java";

        // TODO: Access specific word frequencies
        // Get frequency of "java" using get() method, store in Integer variable javaCount
        // Get frequency of "unknown" using get() method, store in Integer variable unknownCount
        // Get frequency of "programming" using getOrDefault() method with default 0, store in Integer variable programmingCount
        Integer javaCount = wordFrequency.get("java");
        Integer unknownCount = wordFrequency.get("unknown");
        Integer programmingCount = wordFrequency.getOrDefault("programming", 0);

        System.out.println("   Frequency of '" + searchWord + "': " + javaCount);
        System.out.println("   Frequency of 'unknown': " + unknownCount);
        System.out.println("   Frequency of 'programming' (using getOrDefault): " + programmingCount);
        System.out.println();

        // ========== SECTION 5: Checking for Keys and Values ==========
        System.out.println("5. Checking if map contains specific keys and values...");

        // TODO: Check map contents
        // Check if map contains key "java" using containsKey(), store in boolean variable hasJava
        // Check if map contains value 5 using containsValue(), store in boolean variable hasCount5
        // Check if map contains value 2 using containsValue(), store in boolean variable hasCount2
        boolean hasJava = wordFrequency.containsKey("java");
        boolean hasCount5 = wordFrequency.containsValue(5);
        boolean hasCount2 = wordFrequency.containsValue(2);

        System.out.println("   Contains key 'java': " + hasJava);
        System.out.println("   Contains value 5: " + hasCount5);
        System.out.println("   Contains value 2: " + hasCount2);
        System.out.println();

        // ========== SECTION 6: Updating Frequencies ==========
        System.out.println("6. Manually updating a word frequency...");

        System.out.println("   Before update - 'applications' frequency: " + wordFrequency.get("applications"));

        // TODO: Update the frequency of "fun" to 10 using put() method
        wordFrequency.put("fun", 10);

        System.out.println("   After update - 'applications' frequency: " + wordFrequency.get("applications"));
        System.out.println();

        // ========== SECTION 7: Iterating Through the Map ==========
        System.out.println("7. Displaying all word frequencies...");

        System.out.println("   Method 1: Iterating through keys");
        // TODO: Create a for-each loop to iterate through keySet()
        // For each word in wordFrequency.keySet():
        // Print: "     '" + word + "' appears " + wordFrequency.get(word) + " times"
        for (String word : wordFrequency.keySet()) {
            System.out.println("     '" + word + "' appears " + wordFrequency.get(word) + " times");
        }

        System.out.println();

        System.out.println("   Method 2: Iterating through entries");
        // TODO: Create a for-each loop to iterate through entrySet()
        // For each Map.Entry<String, Integer> entry in wordFrequency.entrySet():
        // Print: "     '" + entry.getKey() + "' appears " + entry.getValue() + " times"
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("     '" + entry.getKey() + "' appears " + entry.getValue() + " times");
        }

        System.out.println();

        // ========== SECTION 8: Finding Most and Least Frequent Words ==========
        System.out.println("8. Finding most and least frequent words...");

        // TODO: Uncomment the code below to find extremes
        String mostFrequent = "";
        String leastFrequent = "";
        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                leastFrequent = entry.getKey();
            }
        }
        System.out.println("   Most frequent word: '" + mostFrequent + "' (" + maxCount + " times)");
        System.out.println("   Least frequent word: '" + leastFrequent + "' (" + minCount + " times)");
        System.out.println();

        // ========== SECTION 9: Map Statistics ==========
        System.out.println("9. Final statistics...");

        System.out.println("   Total unique words: " + wordFrequency.size());
        System.out.println("   All unique words: " + wordFrequency.keySet());
        System.out.println("   All frequency values: " + wordFrequency.values());
        System.out.println("   Final map: " + wordFrequency);

        System.out.println("\n=== LAB COMPLETE ===");

    }
}
