package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("연필 개수를 입력해 주세요\n");
        String input = sc.nextLine();
        System.out.print("학생 수를 입력해 주세요\n");
        String input1 = sc.nextLine();
        int pencil = Integer.parseInt(input);
        int student = Integer.parseInt(input1);
        System.out.println("학생 한 명당 연필 : " + (pencil / student));
        System.out.println("남는 연필 : " + (pencil % student));
        sc.close();
    }

}
