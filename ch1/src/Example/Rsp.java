package Example;

import java.util.Scanner;

public class Rsp {
    public static void main(String[] args) {
        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자 생성
        int computer = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 : 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("게임에 낼 것을 입력해주세요. : ");
        String player = sc.nextLine();
        int rsp1 = Integer.parseInt(player);

        if () {

        }

    }
}
