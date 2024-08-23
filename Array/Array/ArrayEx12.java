<<<<<<< HEAD
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx12 {
    public static void main(String[] args) {
        // 5명의 학생들의 점수를 입력받아서 최고점수, 평균 출력
        // 5라는 숫자는 변경될 수 있으므로 동적으로 생성
        int scores[];

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 >> ");

        int student = sc.nextInt();

        scores = new int[student];
        int max = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번 학생 점수 입력 : ", i + 1);
            scores[i] = sc.nextInt();
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }

        }
        System.out.printf("최대값 : %d\n", max);
        System.out.printf("평균 : %d", sum / scores.length);
        sc.close();
    }
}
=======
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx12 {
    public static void main(String[] args) {
        // 5명의 학생들의 점수를 입력받아서 최고점수, 평균 출력
        // 5라는 숫자는 변경될 수 있으므로 동적으로 생성
        int scores[];

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 >> ");

        int student = sc.nextInt();

        scores = new int[student];
        int max = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번 학생 점수 입력 : ", i + 1);
            scores[i] = sc.nextInt();
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }

        }
        System.out.printf("최대값 : %d\n", max);
        System.out.printf("평균 : %d", sum / scores.length);
        sc.close();
    }
}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
