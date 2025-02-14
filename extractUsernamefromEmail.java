import java.util.*;
public class extractUsernamefromEmail {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String userName = "";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                userName += email.charAt(i);
            }
        }
        
        if (!userName.isEmpty()) {
            userName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
        }
        System.out.println(userName);
        sc.close();
    }
}
