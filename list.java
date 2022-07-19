import java.util.*;

public class list {
node head;
     class node{
      int data;
      node next;

      public  node(int d) {
                  data=d;
                  next=null;
        
      }
     }

     public void insert(int d) {
     
        node newnode=new node(d);
        if(head==null){
    head=newnode;
     }else{
        
       
        newnode.next=head.next;
        head=newnode;
          }
     }

     public void print() {
        System.out.println("linklist->");
      node temp=head;
        while(temp!=null){
            System.out.println("->"+temp.data+"->");
           temp=temp.next;
         
        }
     }

     public int  pop() {
        
      node temp = head;
      if(head==null){
        System.out.println("list is empty");
        return -1;
      }else{
        head=head.next;
        return temp.data;
      }
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        list list1=new list();
        System.out.println("enter the data to be inserted in linklist");
        int d=sc.nextInt();
        list1.insert(d);



        System.out.println("enter the data to be inserted in linklist");
        d=sc.nextInt();
        list1.insert(d);
        
        System.out.println("enter the data to Be inserted in linklist");
        d=sc.nextInt();
        list1.insert(d);

        System.out.println("enter the data to Be inserted in linklist");
        d=sc.nextInt();
        list1.insert(d);

        System.out.println("enter the data to Be inserted in linklist");
        d=sc.nextInt();
        list1.insert(d);
        
        System.out.println("element pop:"+list1.pop());
        list1.print();

sc.close();

    }
}
