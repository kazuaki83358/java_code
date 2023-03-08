import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Reverse {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("cat");
        mylist.add("dog");
        mylist.add("fish");
        mylist.add("cow");
        System.out.println(mylist);
        Collections.reverse(mylist);
        System.out.println(mylist);
    }
}
