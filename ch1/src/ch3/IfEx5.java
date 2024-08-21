package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        // 근무 시간에 따른 임금계산
        // 근무시간 입력
        // 8시간 까지 시간당 기본임금(10000) 제공
        // 초과근무시간은 시간당 기본임금 1.5배 제공

        Scanner sc = new Scanner(System.in);
        System.out.println("근무 시간");

        int time = sc.nextInt();
        int money = 10000 * time;
        if (time > 8) {
            System.out.println(money + (int) (1.5 * 10000 * (time - 8)));

        } else {
            System.out.println(money);
        }
        sc.close();

    }
}
