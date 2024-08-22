package ch4;

public class ForEx1 {

    public static void main(String[] args) {
        // 반복문
        // 안녕하세요 10번 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요");
        }

        // int i =0; 실행
        // 1 < 10; 조건 검사
        // for 블럭 안으로 진입
        // for 블럭 안 구문 실행
        // i = 10 일 때 조건 검사 false 가 되면 반복 종료

        for (int i = 1; i < 11; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int i = 1; i < 11; i += 2) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + "\t");
        }

    }
}
