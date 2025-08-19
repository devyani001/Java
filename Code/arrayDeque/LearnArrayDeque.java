package Code.arrayDeque;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // ******** iss ki help se aap Queue aur Stack bhi implement kar sakte ho **********

        // offer() === offerFirst()
        adq.offer(23);              // normally add element in queue in last            --> function aya h "Queue"      se
            // output : [23]

        adq.offerFirst(12);         // jha pr head hoga vha element add kr dega         --> function aya h "ArrayDeque" se
            // output : [12, 23]

        adq.offerLast(34);          // add element at the last                          --> function aya h "ArrayDeque" se
            // output : [12, 23, 34]

        adq.offer(26);              // normally add element in queue in last            --> function aya h "Queue"      se
            // output : [12, 23, 34, 26]

        System.out.println(adq);
            // output : [12, 23, 34, 26]

        System.out.println(adq.peek());
            // output : 12
        System.out.println(adq.peekFirst());
            // output : 12
        System.out.println(adq.peekLast());
            // output : 26
        System.out.println(adq.poll());
            // output : 12


        System.out.println("poll() " +adq);
            // output : [23, 34, 26]

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " +adq);
            // output : 23
            //          pollFirst() [34, 26]

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " +adq);
            // output : 26
            //          pollLast() [34]

    }
}
