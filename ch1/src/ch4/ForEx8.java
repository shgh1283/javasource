package ch4;

public class ForEx8 {
    public static void main(String[] args) {
        // 4x +5y = 60을 만족하는 x,y 값 출력
        // x,y 는 10이하의 자연수

        int a = 4;
        int b = 5;

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (a * i + b * j == 60) {
                    System.out.printf("(%d,%d)\n", i, j);
                }
            }
        }

    }
}
