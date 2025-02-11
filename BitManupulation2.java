public class BitManupulation2 {
    
     // Function to toggle a bit at a given position
     public static int toggleBit(int n, int pos) {
        return n ^ (1 << pos);
    }

    public static void main(String[] args) {
        int n = 10; // Binary: 1010
        int pos = 1; // Toggle the bit at position 1
        System.out.println(toggleBit(n, pos)); // Output: 8 (Binary: 1000)
    }
}
