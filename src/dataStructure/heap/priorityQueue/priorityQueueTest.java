package dataStructure.heap.priorityQueue;

import java.util.PriorityQueue;

public class priorityQueueTest {
    public static void main(String[] args) {
        // 기본 오름차순 = 숫자가 낮을수록 우선순위가 높음
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // 원소 추가
        boolean b1 = priorityQueue.offer(50);
        boolean b2 = priorityQueue.offer(10);
        boolean b3 = priorityQueue.offer(30);

        // 루트 조회
        int r1 = priorityQueue.peek();

        // 루트 제거 및 반환
        int r2 = priorityQueue.poll();

        // 우선순위 큐의 크기 조회
        int size = priorityQueue.size();

        // 특정 원소 포함 여부 조회
        boolean contains = priorityQueue.contains(30);

        // 우선순위 큐가 비어있는지 조회
        boolean isEmpty = priorityQueue.isEmpty();

        // 우선순위 큐 비우기
        priorityQueue.clear();
    }

    static class Student implements Comparable<Student> {
        String name;
        int score;
        int age;

        public Student(
                String name,
                int score,
                int age
        ) {
            this.name = name;
            this.score = score;
            this.age = age;
        }

        @Override
        public int compareTo(Student target) {
            if(this.score == target.score){
                return Integer.compare(this.age, target.age);
            }
            return Integer.compare(this.score, target.score);
        }
    }

    public static void main1(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(new Student("하하", 100, 30));
        priorityQueue.offer(new Student("길", 100, 31));
        priorityQueue.offer(new Student("노홍철", 90, 30));

        Student s1 = priorityQueue.poll(); // 노홍철
        Student s2 = priorityQueue.poll(); // 하하
        Student s3 = priorityQueue.poll(); // 길
    }

    public static void main2(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(
                (a, b) -> a.score != b.score
                        ? Integer.compare(a.score, b.score)
                        : Integer.compare(a.age, b.age)
        );
    }
}
