<<<<<<< HEAD
package ch4;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~100까지 합
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println("1~100의 합 : " + sum);

        // 1~100 까지 홀수의 합
        sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }
        System.out.println("1~100의 홀수의 합 : " + sum);

    }

}
=======
package ch4;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~100까지 합
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println("1~100의 합 : " + sum);

        // 1~100 까지 홀수의 합
        sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }
        System.out.println("1~100의 홀수의 합 : " + sum);

    }

}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
