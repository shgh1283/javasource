<<<<<<< HEAD
package ch4;

public class ForEx4 {
    public static void main(String[] args) {
        // 중첩 for
        // for 문 안에 또 다른 for 문 포함( for문 중첩 횟수에 제한은 없음 )

        // *********
        // *********
        // *********

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j - i < 0; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for 동작 단계
        // ①int i = 0; 실행
        // ② i <2; 실행
        // ③ for 내부 진입
        // ④ int j = 0;
        // ⑤ j < 2 ;
        // ⑥ 안쪽 for 구문 실행
        // ⑦ j++; => j < 2; true 라면 다시 안쪽 for 문 실행 j = 2 로 false라면 탈출
        // ⑧ i++ => i < 2; true라면 다시 안쪽 for문 실행 i = 2 로 false라면 이중 for 문 종료
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

            }

        }
    }
}
=======
package ch4;

public class ForEx4 {
    public static void main(String[] args) {
        // 중첩 for
        // for 문 안에 또 다른 for 문 포함( for문 중첩 횟수에 제한은 없음 )

        // *********
        // *********
        // *********

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j - i < 0; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for 동작 단계
        // ①int i = 0; 실행
        // ② i <2; 실행
        // ③ for 내부 진입
        // ④ int j = 0;
        // ⑤ j < 2 ;
        // ⑥ 안쪽 for 구문 실행
        // ⑦ j++; => j < 2; true 라면 다시 안쪽 for 문 실행 j = 2 로 false라면 탈출
        // ⑧ i++ => i < 2; true라면 다시 안쪽 for문 실행 i = 2 로 false라면 이중 for 문 종료
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

            }

        }
    }
}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
