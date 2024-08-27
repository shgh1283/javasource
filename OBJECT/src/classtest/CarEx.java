package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        printCar(car);
        // 속성 변경 가능
        car.company = "현대";
        car.color = "black";
        car.model = "소나타";
        car.maxSpeed = 200;

        printCar(car);

        car.foward();
        car.backword();

        Car cars[] = new Car[2];
        // NullPointerException : 객체 ==> new 아직 안한 상황
        // System.out.println(cars[0].color);

        // String 초기화
        // String str = null; , String str = "";
        String str = ""; // 빈 문자열
        // NullPointerException
        // String str = null;
        // System.out.println(str.length());
    }

    static void printCar(Car car) {
        System.out.println("제조사 : " + car.company);
        System.out.println("모델 : " + car.model);
        System.out.println("색상 : " + car.color);
        System.out.println("최대속력 : " + car.maxSpeed);
    }
}
