import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(345);
        arraylist.add(7554);
        arraylist.add(124);
        System.out.println(arraylist);
        arraylist.add(8540);
        arraylist.add(2, 645);
        System.out.println(arraylist);

        // new list is made and appended at end of the first list

        List<Integer> newlist = new ArrayList<>();
        newlist.add(44);
        newlist.add(96);

        System.out.println(newlist);
        arraylist.addAll(newlist);
        System.out.println(arraylist);

        System.out.println(arraylist.get(3));
        
        //removing the element specified by index
        arraylist.remove(4);
        System.out.println(arraylist);
        
        //removing the specified element in argument with the help of Integer.valueof(56);
        arraylist.remove(Integer.valueOf(96));
        System.out.println(arraylist);
       
       //to change any vlaue in arryalist we can use set mehtod specifing the index where we want to change and value to be repelaced
        arraylist.set(1, 654);
        System.out.println(arraylist);
      
      //checking does arraylist contains this specified element or not 
        System.out.println(arraylist.contains(654));
        System.out.println(arraylist.contains(65));


       //using for loop printing all elements turn by turn

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
       
System.out.println("   /t ");

       //using for each loop printing all elements turn by turn

        for (Integer i : arraylist) {
            System.out.println(i);
        }



    }
}
