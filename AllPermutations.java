public class AllPermutations {
    
    public static void printPermutation(String str, int idx, String prem) {
        if(str.length() == 0){
            System.out.println(prem);
        }

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, idx+1, prem+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, 0, "");
    }
}
