package ch4;

public class ForEx6 {
    public static void main(String[] args) {
        // 1~100까지 숫자 중에서 3의 배수만을 더하기(단, 9의 배수는 제외)

        // 1~100까지 숫자 중에서 3의 배수와 5의배수의 합계
        int sum = 0;

        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum = sum + i;

            }
        }
        System.out.printf("1~100까지 9의 배수를 제외한 3의배수의 합 : %d", sum);
        System.out.println();
        sum = 0;

        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }

        }
        System.out.printf("1~100까지 3의 배수와 5의배수의 합 : %d", sum);
        System.out.println();
    }
}
