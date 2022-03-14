package collections.list;

import java.util.Stack;

public class StackedExercises {
    public static void main(String[] args) {
        System.out.println(checkBalance ("if (a(4) > 9) { foo(a(2)); }"));
        System.out.println(checkBalance ("for  (i=0;i<(3};i++) { foo{)); )"));
        System.out.println(checkBalance ("if (x) {"));


    }

    public static int checkBalance (String code){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < code.length(); i++){
            char ch = code.charAt(i);
            switch (ch){
                case '(':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '('){
                        return i;
                    }
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{'){
                        return i;
                    }
                    break;

                default:
                    break;
            }
        }
        if (!stack.isEmpty()){
        }
        return -1;
    }

}
