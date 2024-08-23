<<<<<<< HEAD
package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1), 바위(2), 보(3) 게임

        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자 생성
        int computer = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 : 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("게임에 낼 것을 입력해주세요. 가위(1), 바위(2), 보(3)\n입력 : ");
        int player = sc.nextInt();
        switch (player - computer) {

            case 1:
            case -2:
                System.out.println("플레이어 승리");
                break;
            case 2:
            case -1:
                System.out.println("플레이어 패배");
                break;
            case 0:
                System.out.println("무승부");
                break;
        }

    }
}
=======
package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1), 바위(2), 보(3) 게임

        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자 생성
        int computer = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 : 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("게임에 낼 것을 입력해주세요. 가위(1), 바위(2), 보(3)\n입력 : ");
        int player = sc.nextInt();
        switch (player - computer) {

            case 1:
            case -2:
                System.out.println("플레이어 승리");
                break;
            case 2:
            case -1:
                System.out.println("플레이어 패배");
                break;
            case 0:
                System.out.println("무승부");
                break;
        }

    }
}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
