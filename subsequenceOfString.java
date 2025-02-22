import java.util.HashSet;

public class subsequenceOfString {

    // Method to find and print unique subsequences
    public static void subsequence(String str, int idx, String newString, HashSet<String> set) {
        // Base case: If we've considered all characters
        if (idx == str.length()) {
            // Check if the newString is not empty and not already present in the set
            if (!newString.isEmpty() && !set.contains(newString)) {
                System.out.println(newString);
                set.add(newString); // Add to set to ensure uniqueness
            }
            return;
        }

        // Current character at index
        char currChar = str.charAt(idx);

        // Include the current character in the subsequence
        subsequence(str, idx + 1, newString + currChar, set);

        // Exclude the current character from the subsequence
        subsequence(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa"; // Input string
        HashSet<String> set = new HashSet<>(); // For storing unique subsequences

        System.out.println("Unique subsequences are:");
        subsequence(str, 0, "", set);
    }
}
