<<<<<<< HEAD
package ch4;

public class WhileEx1 {
    public static void main(String[] args) {
        // for (초기화; 조건문; 증감){}
        int i = 1;
        while (i < 10) {
            System.out.println("안녕하세요");
            i++;
        }
        i = 1;
        while (i <= 10) {
            System.out.print(i + "\t");
            i++;
        }
        // 1~100까지 합
        i = 1;
        int sum = 0;

        while (i < 101) {
            sum = sum + i;
            i++;

        }
        System.out.println("1~100의 합 : " + sum);
    }

}
=======
package ch4;

public class WhileEx1 {
    public static void main(String[] args) {
        // for (초기화; 조건문; 증감){}
        int i = 1;
        while (i < 10) {
            System.out.println("안녕하세요");
            i++;
        }
        i = 1;
        while (i <= 10) {
            System.out.print(i + "\t");
            i++;
        }
        // 1~100까지 합
        i = 1;
        int sum = 0;

        while (i < 101) {
            sum = sum + i;
            i++;

        }
        System.out.println("1~100의 합 : " + sum);
    }

}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
