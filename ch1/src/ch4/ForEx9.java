package ch4;

public class ForEx9 {
    public static void main(String[] args) {
        // 1~100 사이 숫자 중에서 소수 출력

        for (int i = 2; i < 101; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    // i%j == 0 인지 확인 후 숫자세기
                    count = count + 1;
                    // 숫자가 2라면 소수 => 출력
                }

            }
            if (count == 2) {
                System.out.printf("%d\t", i);

            }
        }
    }
}