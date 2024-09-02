package Example;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String corret = new String("돌연사");
        System.out.println("돌을 연속해서 던지면 세글자로");
        System.out.print("정답을 입력해주세요.\n");
        String answer = sc.nextLine();

        if (corret.equals(answer)) {
            System.out.println("정답입니다.");

            String corret1 = new String("직지심체요절");
            System.out.println("최초의 금속활자본은?");
            System.out.print("정답을 입력해주세요.\n");
            String answer1 = sc.nextLine();

            if (corret1.equals(answer1)) {
                System.out.println("정답입니다.");

            } else {
                System.out.println("오답입니다.");
            }
        } else {
            System.out.println("오답입니다.");

        }

    }

}
