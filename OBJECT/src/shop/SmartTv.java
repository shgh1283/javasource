<<<<<<< HEAD
package shop;

public class SmartTv extends Product {
    // 해상도(resolution)
    private String resolution;

    public SmartTv(String pName, int price, String resolution) {
        super(pName, price);
        this.resolution = resolution;
    }

    @Override
    void printExtra() {
        // 해상도 출력
        System.out.println("해상도 정보 : " + resolution);
    }

}
=======
package shop;

public class SmartTv extends Product {
    // 해상도(resolution)
    private String resolution;

    public SmartTv(String pName, int price, String resolution) {
        super(pName, price);
        this.resolution = resolution;
    }

    @Override
    void printExtra() {
        // 해상도 출력
        System.out.println("해상도 정보 : " + resolution);
    }

}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
