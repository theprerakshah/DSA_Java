import java.util.*;

public class circularlinklist {

    Node head;

    public class Node {

        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;

        }
    }

    public void push(int d) {
        Node newnode = new Node(d);
        Node temp = head;
        if (head == null) {
            System.out.println("list will be created and node will we added!!");

            newnode.next = newnode;

        } else {

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
        }
        head = newnode;
        newnode.data = d;
        // 😎
    }

    public void add(int d) {
        Node newnode = new Node(d);
        Node temp = head;
        if (head == null) {
            System.out.println("list will be created and node will we added!!");

            newnode.next = newnode;

        } else {

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
        }

        newnode.data = d;
    }

    public void insert(int num, int d) {
        Node newnode = new Node(d);
        Node temp = head;
        if (head == null) {
            System.out.println("list will be created and node will we added!!");

            newnode.next = newnode;

        } else {

            while (temp.data != num && temp.next != head) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;

        }
        newnode.data = d;

    }

    public int pop() {

        Node temp = head;
        if (head == null) {
            System.out.println("list is empty !!!");
            return -1;
        } else if (temp.next == null) {
            System.out.println("now list is empty!");
            head = null;
            return temp.data;

        } else {
            head = head.next;
            return temp.data;
        }

    }

    public void remove() {
        Node temp = head;
        Node previous = head;
        if (head == null) {
            System.out.println("list is empty !!!");

        } else {
            while (temp.next != head) {
                previous = temp;
                temp = temp.next;
            }
            System.out.println(temp.data + "is romoved!");
            if (temp == head) {
                System.out.println("now list is empty!");
                head = null;
            } else {
                previous.next = head;
            }

        }
    }

    public void delete(int element) {
        Node temp = head;
        Node previous = head;
        if (head == null) {
            System.out.println("list is empty !!!");

        } else {
            while (temp.data != element) {
                previous = temp;
                temp = temp.next;

            }
            if (temp.next == head) {
                previous.next = head;
                System.out.println(temp.data + "is romoved!");
            } else if (temp == head) {
                head = temp.next;
                System.out.println(temp.data + "is romoved!");

            } else {
                System.out.println(temp.data + "is romoved!");
                previous.next = temp.next;

            }
        }
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("list is empty !!!");

        } else {
            System.out.println("traverse from forward direction!");
            while (temp.next != head) {
                System.out.print(temp.data);
                System.out.print("<->");
                temp = temp.next;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("welcome to the Double linklist using java");
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        circularlinklist clist = new circularlinklist();
        System.out.println(
                "Push->1 \t \t add->2 \t\t insert->3 \t\t pop->4\t\t remove->5 \t\t delete->6 \t\t print->7to exit->0");
        while (choice != 0) {

            System.out.println(" enter the choice :");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("enter the number that to be pushed:");
                int d = sc.nextInt();
                clist.push(d);

                break;
            case 2:
                System.out.println("enter the number that to be inserted:");
                d = sc.nextInt();
                clist.add(d);
                break;
            case 3:
                System.out.println("enter the number that to be added:");
                d = sc.nextInt();
                System.out.println("enter the number after that you want to add ");
                int num = sc.nextInt();

                clist.insert(num, d);
                break;
            case 4:
                // System.out.println("enter the number that to be poped:");

                int poped = clist.pop();
                System.out.println(poped + " first element deleted:");
                break;
            case 5:

                clist.remove();

                break;
            case 6:
                System.out.println("enter the number that to be deleted:");
                int element = sc.nextInt();
                clist.delete(element);
                break;
            case 7:
                clist.print();
                break;
            default:
                break;
            }
        }
    }

}
