package Example;

import java.util.Scanner;

public class linearEquationEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x 의 계수를 입력해 주세요 >>");
        double a = sc.nextDouble();
        System.out.println("y 의 계수를 입력해 주세요 >>");
        double b = sc.nextDouble();
        System.out.println("우측항을 입력해 주세요 >>");
        double n = sc.nextDouble();

        for (double i = 1; i < 32000; i++) {
            for (double j = 1; j < 32000; j++) {
                if (a * i + b * j == n) {
                    System.out.printf("(%f,%f)\n", i, j);
                }

            }
        }

    }

}
