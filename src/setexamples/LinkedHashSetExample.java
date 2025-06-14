package setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();

        // add data
        set1.add("Mango");
        set1.add("Guava");
        set1.add("Grapes");
        set1.add("Guava");
        set1.add("Apple");
        set1.add(null);

        System.out.println("set1 is : "+set1);

        // remove data
        set1.remove("Grapes");
        System.out.println("set1 after remove : "+set1);

        // travering using foreach
        System.out.println("trvaering using foreach");
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
