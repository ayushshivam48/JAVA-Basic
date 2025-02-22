import java.util.*;

public class Strings {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        System.out.println("Your name is "+name1);

        System.out.println(name1.length());

        for(int i=0;i<name1.length();i++){
            System.out.println(name1.charAt(i));
        }

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal.");
        }else if(name1.compareTo(name2)>0){
            System.out.println(name2 +" "+"comes first in dictnory");
        }else{
            System.out.println(name1 +" "+"comes first in dictnory");
        }

        String comb = name1.substring(0,3)+name2.substring(name2.length()-3, name2.length());
        System.out.println(comb);

        String str1 = "123";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);

        int num2 = 1234;
        String str2 = Integer.toString(num2);
        System.out.println(str2.length()); 

        sc.close();
    }
}
