import java.util.*;
public class stack_collectionframework {
    public static void main(String[] args) {
        Stack<String> mystack=new Stack<>();

        mystack.push("prerak");
        mystack.push("shah");
        mystack.push("dell");
        mystack.push("laptop");

        System.out.println(mystack.peek()); 
        System.out.println(mystack);

        mystack.pop();
        System.out.println(mystack);
        System.out.println(mystack.peek()); 

    }
}
