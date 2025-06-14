package setexamples;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();

        // add data
        set1.add("Mango");
        set1.add("Guava");
        set1.add("Grapes");
        set1.add("Guava");
        set1.add("Apple");

        System.out.println("set1 is : "+set1);
    }
}
