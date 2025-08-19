package Code.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(62);

        set.add(21);    //does not add, coz it is already there in the set

        System.out.println(set);
            // output : [32, 2, 54, 21, 62] (elements added in given order)

        set.remove(21);
        System.out.println(set);
            // output : [32, 2, 54, 62] (21 is removed)

        // find element is present or not, returns true or false
        System.out.println(set.contains(100));
            // output : false


        // set empty h ya nhi check krna, returns true or false
        System.out.println(set.isEmpty());
            // output : false

        // set m kitne elements present h
        System.out.println(set.size());
            // output : 4

        // set ko clear krna
        set.clear();
        System.out.println(set);
            // output : [] (set is now empty)
            // is ka use kb krte ho, jb test cases jyada ho
    }
}
