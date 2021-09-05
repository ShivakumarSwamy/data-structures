package datastructures;
/*
* References:
* - https://java2blog.com/data-structures-java/#Stack
* */

public class ExampleStackImplementations {

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(2);
        System.out.println(stackArray.pop());
        System.out.println(stackArray.peek());

        stackArray.push(1);
        stackArray.push(2);
        System.out.println(stackArray.peek());
        stackArray.push(3);

        System.out.println(stackArray.pop());
        System.out.println(stackArray.peek());
    }

    private static class StackArray {

        private final int size;
        private final int[] array;
        private int top;

        public StackArray() {
            this(10);
        }

        public StackArray(int size) {
            this.size = size;
            this.array = new int[size];
            this.top = -1;
        }

        public void push(int element) {
            if (!isFull()) {
                array[++top] = element;
            } else {
                System.out.println("Stack is full");
            }
        }

        public int pop() {
            if (isEmpty()) {
                return top;
            }
            return array[top--];
        }

        public int peek() {
            if (isEmpty()) {
                return top;
            }
            return array[top];
        }

        public boolean isFull() {
            return size - 1 == top;
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }
}
