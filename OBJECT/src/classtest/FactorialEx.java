package classtest;

public class FactorialEx {
    public static void main(String[] args) {
        System.out.println(Factorial(0));
    }

    static int Factorial(int n) {
        int result = 0;
        if (n == 1 || n == 0) {
            result = 1;

        } else {
            // 재귀호출(recursive call) : 메소드 내부에서 메소드 자신을 호출
            result = n * Factorial(n - 1);
        }
        return result;

    }
}
