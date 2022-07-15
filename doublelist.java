import java.util.*;

public class doublelist {
    Node head;

    class Node {

        int data;
        Node right;
        Node left;

        public Node(int d) {
            data = d;
            left = null;
            right = null;
        }

    }

    public void push(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            System.out.println("list will be created and node will be pushed!!");
            newnode.right = null;

        } else {
            newnode.right = head;

        }
        newnode.data = d;

        newnode.left = null;
        head = newnode;

    }

    public void insert(int d) {

        Node newnode = new Node(d);
        Node temp = head;
        if (head == null) {
            System.out.println("list will be created and node will be pushed!!");
            newnode.right = null;
            newnode.left = null;

        } else {
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = newnode;
            newnode.left = temp;
            newnode.right = null;

        }
        newnode.data = d;

    }

    public void add(int num, int d) {

        Node newnode = new Node(d);
        Node temp = head;
        try {
            if (head == null) {
                System.out.println("list will be created and node will be pushed!!");
                newnode.right = null;
                newnode.left = null;
                newnode.data = d;

            }

            else {
                while (temp.data != num && temp != null) {
                    temp = temp.right;

                }

                newnode.right = temp.right;
                temp.right.left = newnode;
                temp.right = newnode;
                newnode.left = temp;
                newnode.data = d;

            }

        } catch (Exception e) {
            System.out.println(" Specified element not in the list try again ");
        }
    }

    public int pop() {

        Node temp = head;
        if (head == null) {
            System.out.println("list is empty !!!");
            return -1;
        } else if (temp.right == null) {
            System.out.println("now list is empty!");
            head = null;
            return temp.data;

        } else {
            head = head.right;
            return temp.data;
        }

    }

    public void remove() {
        Node temp = head;
        if (head == null) {
            System.out.println("list is empty !!!");

        } else {
            while (temp.right != null) {
                temp = temp.right;
            }
            System.out.println(temp.data + "is romoved!");
            if (temp == head) {
                System.out.println("now list is empty!");
                head = null;
            } else {
                temp.left.right = null;
            }

        }
    }

    public void delete(int element) {
        Node temp = head;
        if (head == null) {
            System.out.println("list is empty !!!");

        } else {
            while (temp.data != element) {
                temp = temp.right;
            }
            if (temp.right == null) {
                temp.left.right = null;
            } else if (temp == head) {
                head = temp.right;

            } else {
                System.out.println(temp.data + "is romoved!");
                temp.left.right = temp.right;
                temp.right.left = temp.left;
            }
        }
    }

    public void print() {
        Node temp = head;
        Node temp1 = head;
        if (head == null) {
            System.out.println("list is empty !!!");

        } else {
            System.out.println("traverse from forward direction!");
            while (temp != null) {
                System.out.print(temp.data);
                System.out.print("<->");
                temp1 = temp;
                temp = temp.right;
            }
            System.out.println("traverse from backward direction!");

            while (temp1 != null) {
                System.out.print(temp1.data);
                System.out.print("<->");

                temp1 = temp1.left;
            }

        }
    }

    public static void main(String args[]) {
        System.out.println("welcome to the Double linklist using java");
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        doublelist dlist = new doublelist();
        System.out.println(
                "Push->1 \t \t insert->2 \t\t  add->3 \t\t pop->4\t\t remove->5 \t\t delete->6 \t\t print->7to exit->0");
        while (choice != 0) {

            System.out.println(" enter the choice :");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("enter the number that to be pushed:");
                int d = sc.nextInt();
                dlist.push(d);

                break;
            case 2:
                System.out.println("enter the number that to be inserted:");
                d = sc.nextInt();
                dlist.insert(d);
                break;
            case 3:
                System.out.println("enter the number that to be added:");
                d = sc.nextInt();
                System.out.println("enter the number after that you want to add ");
                int num = sc.nextInt();

                dlist.add(num, d);
                break;
            case 4:
                // System.out.println("enter the number that to be poped:");

                int poped = dlist.pop();
                System.out.println(poped + " first element deleted:");
                break;
            case 5:

                dlist.remove();

                break;
            case 6:
                System.out.println("enter the number that to be deleted:");
                int element = sc.nextInt();
                dlist.delete(element);
                break;
            case 7:
                dlist.print();
                break;
            default:
                break;
            }
        }

    }
}
