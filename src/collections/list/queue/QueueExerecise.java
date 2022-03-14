package collections.list.queue;

import java.util.*;

public class QueueExerecise {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        stutter(q);
        System.out.println(q);

        Deque<String > m = new ArrayDeque<>(Arrays.asList("a", "b", "c"));
        mirror(m);
        System.out.println(m);


    }
    public static void stutter(Queue<Integer> q){
        int length = q.size();
        for (int i = 0; i < length; i++){
            Integer elem = q.poll();
            q.offer(elem);
            q.offer(elem);
        }
    }

    public static void mirror(Queue<String> q){
        Deque<String> stack = new ArrayDeque<>();
        int length = q.size();
        while(length-- > 0){
            String elem = q.poll();
            q.offer(elem);
            stack.push(elem);
        }
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
    }


}
