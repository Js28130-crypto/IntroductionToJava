import java.util.ArrayList;

public class testttttttt {
    public static void main(String[] args) {
        //create an ArrayList of integer
        ArrayList<Integer>ids=new ArrayList<>();

        //add three ids 10 20 30 to the arrayList.
        ids.add(new Integer(10));       //adding in integer object
        ids.add(20);        //addin in int. autoboxing is at play
        ids.add(30);        //addin in int. autoboxing is at play

        //get the size of the arrayList.
        int total=ids.size();       //total will be 3

        //print the details of array list
        System.out.println("ArrayList size is "+total);
        System.out.println("ArrayList elements are "+ids);

        //clear all elements from array list
        ids.clear();

        //get the size of the arraylist
        total=ids.size();

        //print the details of arrayList.
        System.out.println("ArrayList size is "+total);
        System.out.println("ArrayList elements are "+ids);

    }
}