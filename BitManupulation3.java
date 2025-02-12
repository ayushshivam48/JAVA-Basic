public class BitManupulation3 {
    
     // Function to count the number of 1's in the binary representation
     public static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 29; // Binary: 11101
        System.out.println(countOnes(n)); // Output: 4
    }
}
