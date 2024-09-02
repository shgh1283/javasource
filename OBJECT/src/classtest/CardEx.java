<<<<<<< HEAD
package classtest;

public class CardEx {
    public static void main(String[] args) {
        // 클래스 변수 : 클래스가 메모리에 올라갈 때 이미 로드 된 상태(바로 호출가능)
        System.out.println("Card Width : " + Card.width);
        System.out.println("Card Height : " + Card.height);
        // 인스턴스 생성
        Card card1 = new Card("Heart", 7);
        System.out.println("Card1 kind : " + card1.getKind() + "\tCard1 Number : " + card1.getNumber());

        Card card2 = new Card("Diamond", "King");
        System.out.println("Card2 kind : " + card2.getKind() + "\tCard2 Number : " + card2.getKind1());

        // card1.width = 100;

        Card.width = 150;
        Card.height = 300;
        System.out.println("Card Width : " + Card.width);
        System.out.println("Card Height : " + Card.height);

        firstMethod();

        CardEx obj = new CardEx();
        obj.secondMethod();
    }

    static void firstMethod() {

    }

    void secondMethod() {

    }

}
=======
package classtest;

public class CardEx {
    public static void main(String[] args) {
        // 클래스 변수 : 클래스가 메모리에 올라갈 때 이미 로드 된 상태(바로 호출가능)
        System.out.println("Card Width : " + Card.width);
        System.out.println("Card Height : " + Card.height);
        // 인스턴스 생성
        Card card1 = new Card("Heart", 7);
        System.out.println("Card1 kind : " + card1.getKind() + "\tCard1 Number : " + card1.getNumber());

        Card card2 = new Card("Diamond", "King");
        System.out.println("Card2 kind : " + card2.getKind() + "\tCard2 Number : " + card2.getKind1());

        // card1.width = 100;

        Card.width = 150;
        Card.height = 300;
        System.out.println("Card Width : " + Card.width);
        System.out.println("Card Height : " + Card.height);

        firstMethod();

        CardEx obj = new CardEx();
        obj.secondMethod();
    }

    static void firstMethod() {

    }

    void secondMethod() {

    }

}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
