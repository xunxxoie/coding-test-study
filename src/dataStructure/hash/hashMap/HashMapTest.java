package dataStructure.hash.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // 크기를 지정하지 않고 선언
        HashMap<String, Integer> hashMap1 = new HashMap<>();

        // 크기를 지정하여 선언(공간 확장 비용 감소)
        HashMap<String, Integer> hashMap2 = new HashMap<>(30);

        // 기존 Map의 원소들을 새로운 Map의 원소로 포함하여 선언
        HashMap<String, Integer> hashMap3 = new HashMap<>(hashMap2);

        // 원소 삽입
        Integer v1 = hashMap1.put("Kim", 21);
        Integer v2 = hashMap1.put("Choi", 24);

        // 원소 삭제
        Integer r1 = hashMap1.remove("Kims");
        Integer r2 = hashMap1.remove("Choi");

        // 특정 Key의 Value 가져오기
        Integer v3 = hashMap1.get("Kim");
        Integer v4 = hashMap1.get("Choi");

        // 크기 조회
        int size = hashMap1.size();

        // 비어있는지 조회
        boolean isEmpty = hashMap1.isEmpty();

        // 특정 키가 존재하는지 조회
        boolean containsKey = hashMap1.containsKey("Kim");

        // 특정 값이 존재하는지 조회
        boolean containsValue = hashMap1.containsValue(21);

        // 비우기
        hashMap1.clear();

        // Entry로 뽑아 Key, Value 순회
        for (Map.Entry<String, Integer> entry : hashMap3.entrySet()) {
            System.out.println("entry = " + entry);
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        // Key만 뽑아 순회
        for (String key : hashMap1.keySet()) {
            System.out.println("key = " + key);
        }

        // Value만 뽑아 순회
        for (Integer value : hashMap1.values()) {
            System.out.println("value = " + value);
        }
    }
}
