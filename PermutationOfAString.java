public class PermutationOfAString {

    public static void printPerm(String str, String permautation) {
        if(str.length() == 0){
        System.out.println(permautation);
        return;
        }

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPerm(newStr, permautation+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}