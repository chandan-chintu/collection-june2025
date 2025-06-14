package listexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
//        //wrapper class
//        int a=10; // a is stored as variable inside memory
//        a =null; // no possible
//
//        Integer b=10; // b is stored as object inside memory
//        b =null;

        // declaring arraylist
        List<Integer> list1 = new ArrayList<>();

        // add into list1
        list1.add(23);
        list1.add(44);
        list1.add(12);
        list1.add(23);
        list1.add(null);
        list1.add(7);
        list1.add(55);
        list1.add(43);

        System.out.println("list1 is : "+list1);

        //remove data
        list1.remove(4);
        System.out.println("list1 after removing 4th index : "+list1);
        list1.remove(1);
        System.out.println("list1 after removing 1st index : "+list1);

        // search/get data
        System.out.println("value at 3rd index : "+list1.get(3));
        System.out.println("value at 5th index : "+list1.get(5));

        // size of the list
        System.out.println("list1 size is : "+list1.size());

        // sort the list
        Collections.sort(list1);
        System.out.println("list1 after sorting : "+list1);

        // traversing the list
        System.out.println("Traversing the list1 foreach");
        for(Integer l1:list1){
            System.out.println("l1 is : "+l1);
        }

    }
}
