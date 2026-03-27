package dataStructure.linearStructure.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // 원소 삽입
        queue.offer(1);
        queue.offer(2);

        System.out.println("queue = " + queue);

        // 원소 꺼내기
        Integer e1 = queue.poll();
        Integer e2 = queue.poll();

        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);

        // 원소 삽입
        boolean r1 = queue.offer(3); // 성공 시 true 반환
        boolean r2 = queue.offer(4); // 실패 시 false 반환

        boolean r3 = queue.add(5); // 성공 시 true 반환
        boolean r4 = queue.add(6); // 실패 시 예외 반환

        // 원소 삭제
        Integer p1 = queue.poll(); // 성공 시 삭제된 원소 반환
        Integer p2 = queue.poll(); // 실패 시(큐가 비어있을 때) null 반환

        Integer t3 = queue.remove(); // 성공 시 삭제된 원소 반환
        Integer t4 = queue.remove(); // 실패 시(큐가 비어있을 때) 예외 반환

        // 특정 원소 삭제
        boolean r5 = queue.remove(1);

        // 가장 앞에 있는 원소 참조
        Integer e3 = queue.peek(); // 공백 큐이면 null 반환
        Integer e4 = queue.element(); // 공백 큐이면 에외 반환

        // 큐 크기 확인
        int size = queue.size();

        // 큐 비어있는지 확인
        boolean empty = queue.isEmpty();

        // 큐 초기화
        queue.clear();

        // 특정 원소 포함 확인
        queue.contains(10);
    }
}
