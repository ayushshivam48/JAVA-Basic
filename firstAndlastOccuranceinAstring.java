import java.util.*;
public class firstAndlastOccuranceinAstring {
    
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char ele) {
        
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == ele){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(str, idx+1, ele);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        findOccurance(str, 0, 'a');
        sc.close();
    }
}
