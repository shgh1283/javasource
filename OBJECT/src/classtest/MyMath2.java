package classtest;

public class MyMath2 {
    // 인스턴스(멤버)변수
    private long a, b;

    public MyMath2(long a, long b) {
        this.a = a;
        this.b = b;
    }

    // 인스턴스 메소드
    long add() {
        return a + b;
    }

    long subtract() {
        subtract(15, 5);
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    // 클래스 메소드
    static long add(long c, long d) {

        // a변수에 접근 : 1. 인스턴스 생성 or 2. a를 static 으로 선언
        // MyMath2 math = new MyMath2(10, 5);
        // math.a = 15;
        return c + d;
    }

    static long subtract(long c, long d) {
        return c - d;
    }

    static long multiply(long c, long d) {
        return c * d;
    }

    static double divide(long c, long d) {
        return c / d;
    }

    static int divide(int a, int b) {

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
