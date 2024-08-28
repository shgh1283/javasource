package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        // 자동 형변환
        car = fe; // Car car = new FireEngine();
        /// car.water(); (X)

        // 조상타입은 자손타입으로 강제 형변환
        fe2 = (FireEngine) car;
        fe2.water();
        Car car2 = new Car();
        if (car2 instanceof FireEngine) {
            fe = (FireEngine) car2;
            fe.drive();
        }
        if (car2 instanceof Car) {

        }
        // ClassCastException:(실행시(런타임)에러가 발생)

    }
}
