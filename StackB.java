import java.util.*;
public class StackB{

    public static void PushAtBottom(Stack<Integer> s, int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }

        int top = s.pop();
        PushAtBottom(s, n);
        s.push(top);
    }
    public static void main(String args[]){
        Stack <Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);

        PushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}