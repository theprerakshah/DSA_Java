import java.util.*;

public class queue_collection {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // queuelist.offer() add the element in queue and if error occru it returns
        // false
        queue.offer("prerak");
        queue.offer("shah");
        queue.offer("dell");
        queue.offer("laptop");

        // queuelist.add() add the element in queue and if error occru it thorows
        // exceptions
        queue.add("hewy");
        queue.add("my nameis");

        //queuelist.peek()  show the first element in queue and if queue is empty then return null
        System.out.println(queue.peek());
        System.out.println(queue);

        //queue.poll() will remove the first element from queue and returns that element if queue is empty and then return null


        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);
       
 // queue.remove will remove the first element from queue and if queue is emputy then it will through exception 
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}
