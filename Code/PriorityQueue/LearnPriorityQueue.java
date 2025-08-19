package Code.PriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    // public static void main(String[] args) {

    //     // "Queue" banayi h of type "Integer", works as a minHeap
    //     Queue<Integer> pq = new PriorityQueue<>();

    //     pq.offer(40);
    //     pq.offer(12);
    //     pq.offer(24);
    //     pq.offer(36);
    //     System.out.println(pq);
    //     // output : [12, 36, 24, 40]         Queue increasing order m print hogi
    //     // here queue is printing in ascending order. prioritywise. So, here "minHeap" implement ho rha h. Heap ds hota h basically
    //     // minHeap ds me sbse chota element sabse top p hota h

    //     pq.poll();                              // wo element bhr niklega jiski priority sbse jyada h.s
    //     System.out.println(pq);
    //     // output : [24, 36, 40] 

    //     System.out.println(pq.peek());          // jo element bhr nikalne wal h usko return krta h
    //     // output : 24

    // }    

    public static void main(String[] args) {
        
        // "Queue" banayi h of type "Integer", works as a maxHeap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);
        // output : [40, 36, 24, 12]
        // here queue is printing in descending order. prioritywise. So, here "maxHeap" implement ho rha h. Heap ds hota h basically
        // maxHeap ds me sbse bda element sabse top p hota h

        pq.poll();                              // wo element bhr niklega jiski priority sbse jyada h.s
        System.out.println(pq);
        // output : [36, 12, 24] 

        System.out.println(pq.peek());          // jo element bhr nikalne wal h usko return krta h
        // output : 36

    }
}
