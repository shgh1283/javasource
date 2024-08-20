package ch1;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수를 입력해 주세요 >>");

        String input = sc.nextLine();
        String input2 = sc.nextLine();
        int num1 = Integer.parseInt(input);
        int num2 = Integer.parseInt(input2);

        System.out.println("입력내용 :" + input + "," + input2);
        System.out.printf("num1= %d,num2= %d\n", num1, num2);
        System.out.printf("%d+%d=%d\n", num1, num2, (num1 + num2));
        System.out.printf("두 정수의 합 :%d\n", num1 + num2);
        System.out.printf("%d*%d=%d\n", num1, num2, (num1 * num2));
        System.out.printf("두 정수의 곱 :%d\n", num1 * num2);

        sc.close();
    }

}
