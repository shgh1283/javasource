<<<<<<< HEAD
package poly;

public class ProductEx {
    public static void main(String[] args) {
        // 물건 구입

        Buyer buyer = new Buyer();

        // computer 구입
        buyer.buy(new Computer());
        // Airconditioner 구입
        buyer.buy(new Air());

        buyer.summary();

        System.out.println("현재 남은 돈 : " + buyer.money + " 만원 ");
        System.out.println("현재 보너스 포인트 : " + buyer.bonusPoint + " 점 ");
    }

}
=======
package poly;

public class ProductEx {
    public static void main(String[] args) {
        // 물건 구입

        Buyer buyer = new Buyer();

        // computer 구입
        buyer.buy(new Computer());
        // Airconditioner 구입
        buyer.buy(new Air());

        buyer.summary();

        System.out.println("현재 남은 돈 : " + buyer.money + " 만원 ");
        System.out.println("현재 보너스 포인트 : " + buyer.bonusPoint + " 점 ");
    }

}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
