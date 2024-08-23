<<<<<<< HEAD
package ch3;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 점수를 입력받아서 90 이상이면 A, 98이상이면 A+, 94 이상이면 A0, 94미만이면 A-
        // 점수를 입력받아서 80 이상이면 B, 88이상이면 B+, 84 이상이면 B0, 84미만이면 B-

        char grade = ' ', opt = '0';

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 >>");
        int score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            } else if (score >= 94) {
                opt = '0';
            }

        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            } else if (score >= 84) {
                opt = '0';
            }
        }
        System.out.printf("점수 : %d, 학점 : %c%c\n", score, grade, opt);

        sc.close();
    }
}
=======
package ch3;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 점수를 입력받아서 90 이상이면 A, 98이상이면 A+, 94 이상이면 A0, 94미만이면 A-
        // 점수를 입력받아서 80 이상이면 B, 88이상이면 B+, 84 이상이면 B0, 84미만이면 B-

        char grade = ' ', opt = '0';

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 >>");
        int score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            } else if (score >= 94) {
                opt = '0';
            }

        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            } else if (score >= 84) {
                opt = '0';
            }
        }
        System.out.printf("점수 : %d, 학점 : %c%c\n", score, grade, opt);

        sc.close();
    }
}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
