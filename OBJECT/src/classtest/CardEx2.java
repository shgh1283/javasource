<<<<<<< HEAD
package classtest;

import java.util.Arrays;

public class CardEx2 {
    public static void main(String[] args) {
        // Card 인스턴스를 10개 생성해야 한다면?
        // Card card1 = new Card("Spade", null);
        // Card card2 = new Card("Spade", null);
        // Card card3 = new Card("Spade", null);
        // Card card4 = new Card("Spade", null);
        // Card card5 = new Card("Spade", null);
        // Card card6 = new Card("Spade", null);
        // Card card7 = new Card("Spade", null);
        // Card card8 = new Card("Spade", null);
        // Card card9 = new Card("Spade", null);

        // 배열
        // int arr[] = new int[10];
        // System.out.println(Arrays.toString(arr));
        // arr[0] = 15;
        // arr[1] = 20;
        // arr[2] = 30;
        // System.out.println(Arrays.toString(arr));
        int arr[] = { 15, 20, 30, };
        System.out.println(Arrays.toString(arr));
        // 객체 배열
        // Card 객체 담기
        // Card cards[] = new Card[3];
        // 초기화 안했을 때 null 값으로 나옴

        // cards[0] = new Card("Spade", 1);
        // cards[1] = new Card("Spade", 2);
        // cards[2] = new Card("Spade", 3);
        // Card cards[] = {card1, card2, card3}
        // System.out.println(Arrays.toString(cards));
        Card cards[] = {
                new Card("Spade", 1),
                new Card("Spade", 2),
                new Card("Spade", 3)
        };

        // Card card1 = new Card("Spade", 1);
        // Card card2 = new Card("Spade", 2);
        // Card card3= new Card("Spade", 3);
        // Card cards[] = {card1, card2, card3};

        for (Card card : cards) {
            System.out.println("kind" + card.getKind() + " number\t" + card.getNumber());
        }
    }
}
=======
package classtest;

import java.util.Arrays;

public class CardEx2 {
    public static void main(String[] args) {
        // Card 인스턴스를 10개 생성해야 한다면?
        // Card card1 = new Card("Spade", null);
        // Card card2 = new Card("Spade", null);
        // Card card3 = new Card("Spade", null);
        // Card card4 = new Card("Spade", null);
        // Card card5 = new Card("Spade", null);
        // Card card6 = new Card("Spade", null);
        // Card card7 = new Card("Spade", null);
        // Card card8 = new Card("Spade", null);
        // Card card9 = new Card("Spade", null);

        // 배열
        // int arr[] = new int[10];
        // System.out.println(Arrays.toString(arr));
        // arr[0] = 15;
        // arr[1] = 20;
        // arr[2] = 30;
        // System.out.println(Arrays.toString(arr));
        int arr[] = { 15, 20, 30, };
        System.out.println(Arrays.toString(arr));
        // 객체 배열
        // Card 객체 담기
        // Card cards[] = new Card[3];
        // 초기화 안했을 때 null 값으로 나옴

        // cards[0] = new Card("Spade", 1);
        // cards[1] = new Card("Spade", 2);
        // cards[2] = new Card("Spade", 3);
        // Card cards[] = {card1, card2, card3}
        // System.out.println(Arrays.toString(cards));
        Card cards[] = {
                new Card("Spade", 1),
                new Card("Spade", 2),
                new Card("Spade", 3)
        };

        // Card card1 = new Card("Spade", 1);
        // Card card2 = new Card("Spade", 2);
        // Card card3= new Card("Spade", 3);
        // Card cards[] = {card1, card2, card3};

        for (Card card : cards) {
            System.out.println("kind" + card.getKind() + " number\t" + card.getNumber());
        }
    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
