package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // 5! 출력
        // 5 * 4 * 3 * 2 * 1
        // int fact = 1;
        // for (int i = 5; i > 0; i--) {
        //
        // fact = fact * i;
        // }
        // System.out.printf("5! = %d", fact);

        // 특정 숫자의 factorial 구하기
        Scanner sc = new Scanner(System.in);
        System.out.println("factorial 구할 숫자 입력 : ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = num; i > 0; i--) {

            fact = fact * i;
        }

        System.out.printf("%d! = %d", num, fact);

        sc.close();
    }
}
