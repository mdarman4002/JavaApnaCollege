import java.util.HashMap;

public class  HashMapShortestPath {
    public static void main(String[] args) {
        String str = "NS";
        HashMap<Character, Integer> charCount = countOccurrences(str);

        int x = (charCount.getOrDefault('N', 0) - charCount.getOrDefault('S', 0));
        int y = (charCount.getOrDefault('E', 0) - charCount.getOrDefault('W', 0));

        double shortestDistance = Math.sqrt(x * x + y * y);

        System.out.println("Shortest distance: " + shortestDistance);
    }

    public static HashMap<Character, Integer> countOccurrences(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }
}
