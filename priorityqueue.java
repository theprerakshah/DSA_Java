import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> prioque = new PriorityQueue<>();
        // if we want queue in decending order then use comparator.reverseorder()
        // PriorityQueue<Integer> prioque = new
        // PriorityQueue<>(Comparator.reverseOrder());
        prioque.offer(8);
        prioque.offer(43);
        prioque.offer(54);
        prioque.offer(5);
        prioque.offer(69);
        prioque.offer(23);
        prioque.offer(43);
        System.out.println(prioque);
        // to remove the fist element form the queue
        System.out.println(prioque.poll());
        System.out.println(prioque);
        // to print the first element in the queue
        System.out.println(prioque.peek());
        System.out.println(prioque);

        
        prioque.offer(79);
        prioque.offer(100);
        System.out.println(prioque);
    }
}
