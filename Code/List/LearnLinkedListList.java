package Code.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnLinkedListList {

    // ADD ELEMENTS TO AN ARRAY

    // 1)   simple add element in an array, by default end me add krta h List
    /*public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);                            // adds element at the end only
        System.out.println(list);

            output :    [1, 2, 3]
                        [1, 2, 3, 4]
    }*/


    // 2)   if u have to add element at the middle, bich me element add krna hoga to
    /*public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1, 4);                            // at index 1 adds element 4
        System.out.println(list);

            output :    [1, 2, 3]
                        [1, 4, 2, 3]
    }*/

    // 3) add pura ka pura dusra new list to an existing one by using addAll();
    /*public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        List<Integer> newlist = new LinkedList<>();
        newList.add(150);
        newList.add(160);
        list.addAll(newList);
        System.out.println(list);

            output :    [1, 2, 3]
                        [1, 2, 3, 150, 160]
    }*/

    // 4) koi bhi element ko get kaise kro by using sysget()
    /*public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(20);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(1));  // get element at index 1
    }
            output :    20
    */


    // REMOVE AN ELEMENT IN AN ARRAY

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(1);  // remove element at index 2
        System.out.println(list);
            //output :    [10, 30]


        list.remove(Integer.valueOf(10));  // remove element 10 by value
        System.out.println(list);
            //output :    [30]
        
        list.clear();       // clear complete list
        System.out.println(list);
            //output :    []

        //removing element at middle - time complexity O(n)   // because it has to shift elements
        //adding   element at middle - time complexity O(n)   // because it has to shift elements

        // update the particular element value
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.set(0, 1000);
        System.out.println(list);

        // koi element array me present h ya nhi check krna
        System.out.println(list.contains(50));      // returns either true or false
        // is there 50 value element is present in array or not
        // time complexity - O(n) because it has to iterate through the entire list


        // agr pure array ko same operation krna ho toh. like multiply or add 2 in each element of an array.
        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {        //list2.size() - list ka currently kitna size h, isk andr internal array h uska size nhi batate
            System.out.println("the element is " + list2.get(i));
        }

        for (Integer element: list2) {        // for each loop  --> Recommended
            System.out.println("foreach element is " + element);
        }

        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }

    }

}


//              RUN -->
// PS D:\2025\Java\Code\Array> cd ../..
// PS D:\2025\Java> javac Code\Array\LearnArrayList.java
// PS D:\2025\Java> java Code.Array.LearnArrayList
// Hello, kkWorld!
// PS D:\2025\Java> 



//              RUN -->
// PS D:\2025\Java\Code\Array> cd ../..
// PS D:\2025\Java> javac Code\Array\LearnArrayList.java
// Note: Code\Array\LearnArrayList.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// PS D:\2025\Java> java Code.Array.LearnArrayList
// [1, 2, 3]