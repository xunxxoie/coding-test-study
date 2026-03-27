package dataStructure.linearStructure.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // 맨 뒤에 원소 추가
        boolean a = linkedList.add("a");
        boolean b = linkedList.add("b");

        // 맨 앞에 원소 추가
        linkedList.addFirst("c");

        // 맨 뒤에 원소 추가
        linkedList.addLast("d");

        // 특정 위치에 원소 추가
        linkedList.add(0, "e");

        // 컬렉션 내의 원소 추가
        linkedList.addAll(List.of("f", "g", "h"));

        // 특정 위치에 컬랙션 내의 원소 추가
        linkedList.addAll(1, List.of("i", "j", "k"));

        // 맨 앞의 원소 삭제
        String s1 = linkedList.remove();

        // 맨 앞의 원소 삭제
        String s2 = linkedList.removeFirst();

        // 맨 뒤의 원소 삭제
        String s3 = linkedList.removeLast();

        // 특정 위치 원소 삭제
        String s4 = linkedList.remove(0);

        // 컬렉션에 포함된 원소들을 삭제
        boolean b1 = linkedList.removeAll(List.of("i", "j", "k"));

        // 컬렉션에 포함된 원소들을 남기고 나머지 삭제
        boolean b2 = linkedList.retainAll(List.of("i", "j", "k"));

        // 모든 원소 삭제
        linkedList.clear();

        // 리스트가 비어있는지 확인
        boolean isEmpty = linkedList.isEmpty();

        // 리스트 크기 조회
        int size = linkedList.size();

        // 값을 포함하는지 확인
        boolean contains = linkedList.contains("a");

        // 컬렉션을 포함하는지 확인
        boolean containsAll = linkedList.containsAll(List.of("a", "b", "c", "d", "e", "f", "g", "h"));

        // 값이 위치하는 첫번재 인덱스 조회
        int i0 = linkedList.indexOf("a");

        // 값이 위치하는 마지막 인덱스 조회
        int i1 = linkedList.lastIndexOf("a");

        // 인덱스에 위치하는 원소 조회
        String s = linkedList.get(10);

        // 지정된 범위를 슬라이스
        List<String> strings = linkedList.subList(0, 10);

        // 특정 위치의 원소 변경
        String a1 = linkedList.set(0, "a");
    }
}
