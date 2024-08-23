<<<<<<< HEAD
package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        System.out.println("제조사 : " + car.company); // null
        System.out.println("모델 : " + car.model); // null
        System.out.println("색상 : " + car.color); // null
        System.out.println("최대속력 : " + car.maxSpeed); // null

        // 속성 변경 가능
        car.company = "현대";
        car.color = "black";
        car.model = "소나타";
        car.maxSpeed = 200;

        System.out.println("제조사 : " + car.company);
        System.out.println("모델 : " + car.model);
        System.out.println("색상 : " + car.color);
        System.out.println("최대속력 : " + car.maxSpeed);

        car.foward();
        car.backword();

    }
}
=======
package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        System.out.println("제조사 : " + car.company); // null
        System.out.println("모델 : " + car.model); // null
        System.out.println("색상 : " + car.color); // null
        System.out.println("최대속력 : " + car.maxSpeed); // null

        // 속성 변경 가능
        car.company = "현대";
        car.color = "black";
        car.model = "소나타";
        car.maxSpeed = 200;

        System.out.println("제조사 : " + car.company);
        System.out.println("모델 : " + car.model);
        System.out.println("색상 : " + car.color);
        System.out.println("최대속력 : " + car.maxSpeed);

        car.foward();
        car.backword();

    }
}
>>>>>>> ed2c435241f44c6a1c804d573ef7af61a47d6ca4
