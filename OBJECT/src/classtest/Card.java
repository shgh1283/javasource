<<<<<<< HEAD
package classtest;

public class Card {
    // 멤버 변수
    private String kind; // spade, diamond, clover, heart
    private String kind1; // spade, diamond, clover, heart
    private int number;

    // 클래스 변수
    static int width = 100;
    static int height = 250;

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public Card(String kind, String kind1) {
        this.kind = kind;
        this.kind1 = kind1;
    }

    public String getKind() {
        return kind;
    }

    public int getNumber() {
        return number;
    }

    public String getKind1() {
        return kind1;
    }

}
=======
package classtest;

public class Card {
    // 멤버 변수
    private String kind; // spade, diamond, clover, heart
    private String kind1; // spade, diamond, clover, heart
    private int number;

    // 클래스 변수
    static int width = 100;
    static int height = 250;

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public Card(String kind, String kind1) {
        this.kind = kind;
        this.kind1 = kind1;
    }

    public String getKind() {
        return kind;
    }

    public int getNumber() {
        return number;
    }

    public String getKind1() {
        return kind1;
    }

}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
