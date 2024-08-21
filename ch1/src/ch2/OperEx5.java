package ch2;

import java.util.Scanner;

public class OperEx5 {
    public static void main(String[] args) {

        // 사용자로부터 한달 월급을 입력받은 후 월급을 10년간 저축 한 값

        Scanner sc = new Scanner(System.in);

        System.out.print("월급을 입력해 주세요\n");
        String input = sc.nextLine();
        int won = Integer.parseInt(input);
        int deposit = won * 12 * 10;
        System.out.printf("월급 : %d, 10년 저축금액 :%d ", won, deposit);

        sc.close();
    }

}
