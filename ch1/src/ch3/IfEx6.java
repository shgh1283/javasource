<<<<<<< HEAD
package ch3;

import java.util.Scanner;

public class IfEx6 {
    public static void main(String[] args) {
        // 윤년/평년 구하기

        // 윤년 2012,2016,2020,2024
        // 윤년 : 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아니거나, 년도를 400으로 나눈 나머지가 0인 경우

        // 현재년도가 윤년인지 평년인지 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("입력년도");
        int years = sc.nextInt();
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }
        sc.close();
    }
}
=======
package ch3;

import java.util.Scanner;

public class IfEx6 {
    public static void main(String[] args) {
        // 윤년/평년 구하기

        // 윤년 2012,2016,2020,2024
        // 윤년 : 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아니거나, 년도를 400으로 나눈 나머지가 0인 경우

        // 현재년도가 윤년인지 평년인지 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("입력년도");
        int years = sc.nextInt();
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }
        sc.close();
    }
}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
