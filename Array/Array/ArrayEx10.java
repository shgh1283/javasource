<<<<<<< HEAD
package Array;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 원래 단어 맞추기
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            // 문제 출제
            char[] question = words[i].toCharArray();
            for (int j = 0; j < question.length; j++) {
                int pos = (int) (Math.random() * question.length);

                char temp = question[j];
                question[j] = question[pos];
                question[pos] = temp;
            }
            System.out.printf("Q%d %s의 원래 단어는 무엇일까요?", i + 1, new String(question));

            String answer = sc.nextLine(); // 답변 입력

            if (words[i].equalsIgnoreCase(answer)) {
                System.out.println(" 정답입니다. ");
            } else {
                System.out.println(" 오답입니다. ");
            }
        }

        // 사용자의 답변이 원래 단어와 일치하는지 확인 후 정답입니다 or 틀렸습니다. 출력

    }

}
=======
package Array;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 원래 단어 맞추기
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            // 문제 출제
            char[] question = words[i].toCharArray();
            for (int j = 0; j < question.length; j++) {
                int pos = (int) (Math.random() * question.length);

                char temp = question[j];
                question[j] = question[pos];
                question[pos] = temp;
            }
            System.out.printf("Q%d %s의 원래 단어는 무엇일까요?", i + 1, new String(question));

            String answer = sc.nextLine(); // 답변 입력

            if (words[i].equalsIgnoreCase(answer)) {
                System.out.println(" 정답입니다. ");
            } else {
                System.out.println(" 오답입니다. ");
            }
        }

        // 사용자의 답변이 원래 단어와 일치하는지 확인 후 정답입니다 or 틀렸습니다. 출력

    }

}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
