<<<<<<< HEAD
package modifier;

public class Card {
    // final field NUMBER may not have been initialized
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 150;

    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("Heart", 2);
    }

    @Override
    public String toString() {
        return "Card [NUMBER=" + NUMBER + ", KIND=" + KIND + "]";
    }

}
=======
package modifier;

public class Card {
    // final field NUMBER may not have been initialized
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 150;

    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("Heart", 2);
    }

    @Override
    public String toString() {
        return "Card [NUMBER=" + NUMBER + ", KIND=" + KIND + "]";
    }

}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
