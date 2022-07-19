import java.util.*;

public class linklist {
    Node head;

    class Node {

        int data;
        Node next;

        public Node(int d) {

            data = d;
            next = null;
        }
    }

    void deletelist() {
        System.out.println("whole list is deleted!!!");
        head = null;
    }

    public void push(int d) {

        Node newnode = new Node(d);

        // newnode.data = d;
        newnode.next = head;

        head = newnode;
    }

    public void insert(int d) {
        Node newnode = new Node(d);
        Node temp = head;
        newnode.data = d;
        newnode.next = null;
        if (head == null) {

            head = newnode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;

        }

    }

    public void add(int prerviousnum, int d) {

        Node newnode = new Node(d);
        Node temp = head;
        if (head == null) {
            System.out.println("list is empty ! so node can't be added ");

        } else {

            while (temp.data != prerviousnum) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            newnode.data = d;
            temp.next = newnode;
        }

    }

    public int pop() {
        Node temp = head;
        if (head == null) {
            System.out.println("list is empty ! ");
            return -1;
        } else {
            head = head.next;

            return temp.data;
        }

    }

    public void deleted(int element) {
        Node temp = head;
        Node head1 = head;
        if (head1 == null) {
            System.out.println("list is empty ! ");

        } else if (head.data == element) {
            head = head.next;
        } else {
            while (head1.data != element) {
                temp = head1;
                head1 = head1.next;

            }
            temp.next = head1.next;

        }

    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("list is empty ! ");

        } else {
            while (temp != null) {
                System.out.print(temp.data);
                System.out.print("->");

                temp = temp.next;

            }
            System.out.println("\n");
        }

    }

    public static void main(String args[]) {
        System.out.println("welcome to the linklist using java");
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        linklist list1 = new linklist();
        System.out.println(
                "Push->1 \t \t insert->2 \t\t  add->3 \t\t pop->4\t\t delete->5 \t\t delete whole list->6 \t\t print->7to exit->0");
        while (choice != 0) {

            System.out.println("enter the choice :");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("enter the number that to be pushed:");
                int d = sc.nextInt();
                list1.push(d);

                break;
            case 2:
                System.out.println("enter the number that to be inserted:");
                d = sc.nextInt();
                list1.insert(d);
                break;
            case 3:
                System.out.println("enter the number that to be added:");
                d = sc.nextInt();
                System.out.println("enter the number after that you want to add ");
                int num = sc.nextInt();

                list1.add(num, d);
                break;
            case 4:
                // System.out.println("enter the number that to be poped:");

                int poped = list1.pop();
                System.out.println(poped + " element deleted:");
                break;
            case 5:
                System.out.println("enter the number that to be deleted:");
                int del = sc.nextInt();
                list1.deleted(del);
                break;
            case 6:
                list1.deletelist();
                break;
            case 7:
                list1.print();
                break;
            default:
                break;
            }
        }

    }

}