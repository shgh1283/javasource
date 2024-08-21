package ch2;

import java.util.Scanner;

public class OperEx3 {
    public static void main(String[] args) {
        // 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때 학생 한 명당 몇개를
        // 나눠가질 수 있고 최종적으로 몇 개가 남는지 출력하기
        // 조건 ) 변수 사용

        int pencil = 534;
        int student = 30;

        System.out.println("학생 한 명당 연필 : " + pencil / student);
        System.out.println("남는 연필 : " + pencil % student);

        // 사다리꼴의 넓이 구한 후 출력하기
        // 윗변 : 5, 아랫변 : 10, 높이 7
        // 조건 ) 변수사용, 소수자리 수 까지 출력

        float u = 5f, ud = 10f, h = 7f;

        System.out.println("사다리꼴의 넓이:" + (((u + ud) * h)) / 2);

        // int top = 5, bottom = 10, height = 7;
        // double result = (double) (top + bottom) * height / 2;
        // System.out.printf("사다리꼴의 넓이%f:", result);
        // double result = (top+bottom)*height/2.0;

        // 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구한 후 출력
        // 예를 들어 24라면 24보다 크면서 가장 가까운 10의배수는 30-24 = 6 이므로 결과6이 출력되도록한다
        int num = 24;
        System.out.println(10 - (num % 10));
    }

}
