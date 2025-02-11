import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add element
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // to get element
        int ele = list.get(0);
        System.out.println(ele);

        //add ele in b/w
        list.add(1,2);
        System.out.println(list);

        //set element
        list.set(0,0);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //loop on list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting the list
        Collections.sort(list);
        System.out.println(list);
    }
}