<<<<<<< HEAD
package Array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 79, 88, 91, 33, 100, 55, 95 };

        // 배열 요소 중에서 가장 큰 값과 가장 작은 값 구하기
        int min = scores[0];
        int max = scores[0];
        // for (int i = 1; i < scores.length; i++) {

        // if (min > scores[i]) {

        // min = scores[i];
        // }
        // if (max < scores[i]) {

        // max = scores[i];
        // }
        // }

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }

        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
    }
}
=======
package Array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 79, 88, 91, 33, 100, 55, 95 };

        // 배열 요소 중에서 가장 큰 값과 가장 작은 값 구하기
        int min = scores[0];
        int max = scores[0];
        // for (int i = 1; i < scores.length; i++) {

        // if (min > scores[i]) {

        // min = scores[i];
        // }
        // if (max < scores[i]) {

        // max = scores[i];
        // }
        // }

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }

        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
    }
}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
