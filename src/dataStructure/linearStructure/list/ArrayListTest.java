package dataStructure.linearStructure.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 마지막 인덱스에 원소 추가
        list.add(10);
        list.add(20);
        list.add(30);

        // 특정 인덱스에 원소 추가
        list.add(0, 40);

        // 특정 인덱스 원소 가져오기
        Integer value = list.get(0);

        // 특정 인덱스 원소 설정하기
        list.set(0, 50);

        // 특정 인덱스 원소 삭제하기
        list.remove(0);

        // 특정 원소 삭제하기
        list.remove(Integer.valueOf(50));

        // 원소 개수 반환
        int size = list.size();

        // 특정 원소 포함 여부 반환
        boolean contains = list.contains(20);

        // 특정 원소의 첫번째 인덱스 반환
        int i = list.indexOf(20);

        // 비어있는지 여부 확인
        boolean isEmpty = list.isEmpty();

        // 모든 원소 삭제
        list.clear();

        // 오름차순 정렬
        Collections.sort(list);
    }
}
