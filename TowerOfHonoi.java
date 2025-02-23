import java.util.*;
public class TowerOfHonoi {
    
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = (int) Math.pow(2, n) - 1;

        towerOfHanoi(n,"S","H","D");

        System.out.println("Total number of steps: " + steps);

        sc.close();
    }
}
