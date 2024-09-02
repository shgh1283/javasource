<<<<<<< HEAD
package shop;

public class ShopEx {
    public static void main(String[] args) {
        // 배열
        // MyShop shop = new MyShop();

        // 리스트
        MyShop2 shop = new MyShop2();

        // 상점이름 지정
        shop.setTitle("MyShop");
        // user 생성
        shop.genUser();
        // 상품 생성
        shop.genProduct();
        // 상점 시작
        shop.start();
    }
}
=======
package shop;

public class ShopEx {
    public static void main(String[] args) {
        MyShop shop = new MyShop();

        // 상점이름 지정
        shop.setTitle("MyShop");
        // user 생성
        shop.genUser();
        // 상품 생성
        shop.genProduct();
        // 상점 시작
        shop.start();
    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
