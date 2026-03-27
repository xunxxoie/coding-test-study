package dataStructure.hash.hashSet;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();

        // 기존 Collection의 원소들을 포함하여 선언
        HashSet<String> hashSet2 = new HashSet<>(hashSet1);

        // 원소 삽입(중복이면 false 반환)
        boolean b1 = hashSet1.add("QQQ");
        boolean b2 = hashSet1.add("SPY");

        // 원소 삭제(삭제에 실패하면 false 반환)
        boolean b3 = hashSet1.remove("QQQ");

        // 크기 조회
        int size = hashSet1.size();

        // 비어있는지 조회
        boolean b4 = hashSet1.isEmpty();

        // 특정 원소를 포함하고 있는지 조회
        boolean b5 = hashSet1.contains("SPY");

        // 비우기
        hashSet1.clear();

        /**
         * HashSet은 Key-Value 구조가 아니라 바로 순회 가능
         */
        for (String s : hashSet1) {
            System.out.println("s = " + s);
        }
    }
}
