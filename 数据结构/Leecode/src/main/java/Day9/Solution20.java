package Day9;

import java.util.Stack;

public class Solution20 {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);

        System.out.println(queue.peek());

        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

    static class MyQueue {

        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
            stack1.push(x);
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }

        public int pop() {
            return stack2.pop();

        }

        public int peek() {
            return stack2.peek();
        }

        public boolean empty() {
            return stack2.empty();
        }
    }


}
