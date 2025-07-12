package mapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
// some lines added
        // adding data
        map1.put(103,"Mango");
        map1.put(105,"Guava");
        map1.put(104,"Apple");
        map1.put(null,"Pineapple");
        map1.put(101,"Grapes");
        map1.put(107,"Guava");
        map1.put(108,"Mango");
        map1.put(103,"Watermelon");// mango will be overrided and add watermelon
        map1.put(109,"Apple");
        map1.put(104,"Cherry"); // apple will be overrided and adds cherry
        map1.put(110,"Mango");
        map1.put(111,null);
        map1.put(112,null);
        System.out.println("map1 is : "+map1);

        // remove data
        map1.remove(111);
        map1.remove(110);
        System.out.println("map1 after remove is : "+map1);
        // traversing
        System.out.println("traverse using foreach");
        for(Map.Entry m1:map1.entrySet()){
            System.out.println(m1.getKey()+"---"+m1.getValue());
        }
    }
}
