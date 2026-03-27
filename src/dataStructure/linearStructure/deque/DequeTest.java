package dataStructure.linearStructure.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 앞에 원소 삽입
        boolean r1 = deque.offerFirst(10);
        boolean r2 = deque.offerFirst(20);

        // 뒤에 원소 삽입
        boolean r3 = deque.offerLast(30);
        boolean r4 = deque.offerLast(40);

        // 앞에 원소 삽입(실패 시 예외)
        deque.addFirst(10);
        deque.addFirst(20);

        // 뒤에 원소 삽입(실패 시 예외)
        deque.addLast(30);
        deque.addLast(40);

        // 앞에 원소 삭제
        Integer e1 = deque.pollFirst();

        // 뒤에 원소 삭제
        Integer e2 = deque.pollLast();

        // 앞에 원소 삭제(실패 시 예외)
        Integer e3 = deque.removeFirst();

        // 뒤에 원소 삭제(실패 시 예외)
        Integer e4 = deque.removeLast();

        // 앞에 위치한 원소 조회
        Integer e5 = deque.peekFirst();

        // 뒤에 위치한 원소 조회
        Integer e6 = deque.peekLast();

        // 앞에 위치한 원소 조회(실패 시 예외)
        Integer e7 = deque.getFirst();

        // 뒤에 위치한 원소 조회(실패 시 예외)
        Integer e8 = deque.getLast();

        // 덱 크기
        int size = deque.size();

        // 덱 비우기
        deque.clear();

        // 특정 원소 포함 여부 확인
        boolean contains = deque.contains(10);
    }
}
