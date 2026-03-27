package dataStructure.linearStructure.string;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";

        // 문자열 값 비교
        boolean equals = str1.equals(str2);

        // 문자열 값 비교(대소문자 구분 X)
        boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);

        // 문자열 사전순 비교(같으면 0, 앞이면 음수, 뒤면 양수)
        int compareTo = str1.compareTo(str2);

        // 문자열 포함 여부 확인
        boolean contains = str1.contains(str2);

        // 시작 문자열 확인
        boolean startsWith = str1.startsWith(str2);

        // 종료 문자열 확인
        boolean endsWith = str1.endsWith(str2);

        // 첫번째 위치 반환
        int indexOf = str1.indexOf(str2);

        // 마지막 위치 반환
        int lastIndexOf = str1.lastIndexOf(str2);

        // 특정 인덱스 문자 조회
        char charAt = str1.charAt(1);

        // 부분 문자열 추출
        String substring = str1.substring(0, 1);

        // 구분자 기준 분할
        String[] split = str1.split("-");

        // 대문자 변환
        String upperCase = str1.toUpperCase();

        // 소문자 변환
        String lowerCase = str1.toLowerCase();

        // 양쪽 공백 제거
        String trim = str1.trim();

        // 문자열 치환
        String replace = str1.replace("a", "x");

        // 정규식 기반 치환
        String replaceAll = str1.replaceAll("[0-9]", ""); // 숫자 제거

        // 문자열 연결
        String concat = str1.concat(str2);

        // 구분자로 연결
        String join = String.join(", ", "Apple", "Banana", "Cherry"); // "Apple, Banana, Cherry"

        // 형식 지정 문자열 생성
        String format = String.format("이름: %s, 나이: %d", "홍길동", 20); // "이름: 홍길동, 나이: 20"

        // 문자열로 변환
        String valueOf = String.valueOf(10);

        // 문자열 길이
        int length = str1.length();

        // 길이 0 여부
        boolean empty = str1.isEmpty();

        // 공백만 존재하는지 여부
        boolean blank = str1.isBlank();
    }
}
