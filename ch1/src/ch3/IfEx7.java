<<<<<<< HEAD
package ch3;

import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력 받은 후 입력 받은 세 개의 숫자 중 가장 작은 수 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Num1 :");
        int num = sc.nextInt();
        System.out.println("Input Num2 :");
        int num1 = sc.nextInt();
        System.out.println("Input Num3 : ");
        int num2 = sc.nextInt();

        int min = num;

        if (min > num1) {
            min = num1;

        }
        if (min > num2) {
            min = num2;
        }
        System.out.println("제일 작은 수는 :" + min);

        int max = num;
        if (max < num1) {
            max = num1;

        }
        if (max < num2) {
            max = num2;
        }
        System.out.println("제일 큰 수는 :" + max);

        sc.close();
    }
}
=======
package ch3;

import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력 받은 후 입력 받은 세 개의 숫자 중 가장 작은 수 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Num1 :");
        int num = sc.nextInt();
        System.out.println("Input Num2 :");
        int num1 = sc.nextInt();
        System.out.println("Input Num3 : ");
        int num2 = sc.nextInt();

        int min = num;

        if (min > num1) {
            min = num1;

        }
        if (min > num2) {
            min = num2;
        }
        System.out.println("제일 작은 수는 :" + min);

        int max = num;
        if (max < num1) {
            max = num1;

        }
        if (max < num2) {
            max = num2;
        }
        System.out.println("제일 큰 수는 :" + max);

        sc.close();
    }
}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
