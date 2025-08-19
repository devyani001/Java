package Code.Queue;

import java.util.LinkedList;
import java.util.Queue;

// FIFO - first in, first out
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();      // Queue interface ko LinkedList implement krta h

        //Insert === offer()
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);
        //output : [12, 24, 36]

        // Delete === poll() - us element ko delete krta h aur use return bhi krta h, aap use print bhi kr skte ho
        System.out.println(queue.poll());
        System.out.println(queue);
        /*output :  12
                    [24, 36]*/

        System.out.println(queue.peek());       // agla konsa element h jo poll hoga
        //output : 24

    }
}
