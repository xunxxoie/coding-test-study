package dataStructure.linearStructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // stack = [1, 2, 3]
        System.out.println("stack = " + stack);

        /**
         * element = 3
         * element = 2
         * element = 1
         */
        for(int i = 0; i < 3; i++){
            Integer element = stack.pop();
            System.out.println("element = " + element);
        }

        // stack = []
        System.out.println("stack = " + stack);

        Deque<Integer> dequeStack = new ArrayDeque<>();

        // 원소 삽입
        dequeStack.push(1);
        dequeStack.push(2);

        // 원소 꺼내기
        Integer e1 = dequeStack.pop();
        Integer e2 = dequeStack.pop();

        // 최상단 원소 확인
        Integer e3 = dequeStack.peek();

        // 비어있는지 확인
        boolean empty = dequeStack.isEmpty();

        // 원소 개수 확인
        int size = dequeStack.size();

        // 스택 비우기
        dequeStack.clear();
    }
}
