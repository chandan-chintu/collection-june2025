package listexamples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();

        stk1.push(12);
        stk1.push(22);
        stk1.push(12);
        stk1.push(33);
        stk1.push(99);

        System.out.println("stk1 is : "+stk1);

        stk1.pop();
        stk1.pop();
        System.out.println("stk1 after 2 pop :" +stk1);

        //travering
        System.out.println("traversing using foreach");
        for(Integer s1 :stk1){
            System.out.println(s1);
        }
    }
}
