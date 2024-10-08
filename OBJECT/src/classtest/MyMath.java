package classtest;

public class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    // 메소드 오버로딩 method overloading
    double divide(double a, double b) {
        return a / b;
    }

    int divide(int a, int b) {

        // b가 0인지 확인한 후 나누기
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return a / b;

    }

    int max(int a, int b) {
        // a.b 중에서 큰 수 리턴

        int max = a;
        if (max < b) {
            max = b;
        }
        return max;

        // return a > b ? a : b;

    }

}
