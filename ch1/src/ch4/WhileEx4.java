package ch4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {

        boolean run = true;
        int balance = 0; // 잔액

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("=====================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("=====================================\n");
            System.out.print("번호를 입력해 주세요");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 잔액 = 잔액 + 입금액
                    System.out.println("입금할 금액을 입력하십시오 >>");
                    int moneyIn = sc.nextInt();
                    balance = balance + moneyIn;
                    System.out.printf("입금 완료 : + %d\n", moneyIn);
                    System.out.printf("현재 잔액 : %d\n", balance);
                    break;
                case 2:
                    // 잔액 = 잔액 - 출금액
                    System.out.printf("현재 잔액 : %d\n", balance);
                    System.out.println("출금할 금액을 입력하십시오 >>");
                    int moneyOut = sc.nextInt();
                    balance = balance - moneyOut;
                    System.out.printf("출금 완료 : - %d\n", moneyOut);
                    System.out.printf("현재 잔액 : %d\n", balance);
                    break;
                case 3:
                    // 잔액 출력
                    System.out.printf("현재 잔액 : %d\n", balance);

                    break;
                case 4:
                    run = false;
                    break;

            }

        }

    }
}
