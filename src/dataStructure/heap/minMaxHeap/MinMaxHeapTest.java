package dataStructure.heap.minMaxHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinMaxHeapTest {
    public static void main(String[] args) {
        // Collections.reverseOrder()를 Comparator로 전달(내림차순)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // 원소 추가
        boolean b1 = maxHeap.offer(10);
        boolean b2 = maxHeap.offer(20);
        boolean b3 = maxHeap.offer(30);

        // 원소 삭제
        Integer r1 = maxHeap.poll();

        // 최상위 원소 참조
        Integer r2 = maxHeap.peek();

        // 힙의 크기 조회
        int size1 = maxHeap.size();

        // 특정 원소 포함 여부 조회
        boolean b4 = maxHeap.contains(10);

        // 힙이 비어있는지 조회
        boolean b5 = maxHeap.isEmpty();

        // 힙 비우기
        maxHeap.clear();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 원소 추가
        boolean b6 = minHeap.offer(10);
        boolean b7 = minHeap.offer(20);
        boolean b8 = minHeap.offer(30);

        // 원소 삭제
        Integer r3 = minHeap.poll();

        // 최상위 원소 참조
        Integer r4 = minHeap.peek();

        // 힙의 크기 조회
        int size2 = minHeap.size();

        // 특정 원소 포함 여부 조회
        boolean b9 = minHeap.contains(10);

        // 힙이 비어있는지 조회
        boolean b10 = minHeap.isEmpty();

        // 힙 비우기
        minHeap.clear();
    }
}
