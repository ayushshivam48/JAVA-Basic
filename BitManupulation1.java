public class BitManupulation1 {
    
    // Function to check if a number is a power of 2
    public static boolean isPowerOfTwo(int n) {
        // Check if n is greater than 0 and only one bit is set
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPowerOfTwo(num)); // Output: true
    }
}