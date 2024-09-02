package classtest;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // 메소드 호출 => 메소드 실행
        calculator.powerOn();
        // return 존재시 1) 변수에 담기 2) 사용
        int result = calculator.plus(8, 6);
        System.out.println("연산 결과 : " + result);
        double result2 = calculator.divide(14, 8);
        System.out.println("연산 결과 : " + result2);

        // System.out.println(calculator.powerOff()); // void 라면 호출만 가능
        calculator.powerOff();

        Calculator2 calculator2 = new Calculator2();
        calculator2.execute();
    }
}
