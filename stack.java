import java.util.*;

public class stack {
    int[] array = new int[100];
    int top = -1;

    public void push(int d) {
        if (top == 100) {
            System.out.println("stack overfull!!");

        } else {

            top++;
            array[top] = d;

        }
    }

    public void pop() {

        if (top < 0) {
            System.out.println("stack is empty!!!");

        } else {
            System.out.println(+array[top] + " is poped!");
            top--;
        }

    }

    public void peep() {
        if (top < 0) {
            System.out.println("stack is empty!!!");

        } else {
            System.out.println("element is :" + array[top]);
        }

    }

    public void print() {

        int i = top;
        if (i < 0) {
            System.out.println("stack is empty!");
        }

        System.out.println("stack");
        while (i >= 0) {

            System.out.println("  " + array[i]);
            i--;
        }

    }

    public static void main(String args[]) {
        stack newstack = new stack();
        System.out.println("welcome to the world of stack !!");
        int check = 0;
        Scanner sc = new Scanner(System.in);

        while (check != -1) {
            System.out.println("enter choice:");
            check = sc.nextInt();
            switch (check) {
            case 1:

                System.out.print("enter the number that to be pushed in stack:");
                int d = sc.nextInt();
                newstack.push(d);
                break;
            case 2:
                newstack.pop();
                break;
            case 3:
                newstack.peep();
                break;
            case 4:
                newstack.print();
                break;
            case 5:
                check = -1;
            default:
                break;
            }
        }
    }

}
