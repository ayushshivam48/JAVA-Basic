public class BitManupulation4 {
    
    // Function to convert decimal to binary
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }
        return binary.reverse().toString();
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // 2^0
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int decimal = 25;
        String binary = "11001";

        System.out.println(decimalToBinary(decimal)); // Output: 11001
        System.out.println(binaryToDecimal(binary)); // Output: 25
    }
}
