<<<<<<< HEAD
package classtest;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 7);
        System.out.println("삼각형 넓이 : " + triangle.getArea());

        // 밑변, 높이 숫자 변경
        // triangle.baseLine = 15;
        triangle.setBaseLine(15);
        System.out.println("삼각형 넓이 : " + triangle.getArea());

        triangle.setBaseLine(10);
        triangle.setHeight(8);

        System.out.println("삼각형 넓이 : " + triangle.getArea());
    }
}
=======
package classtest;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 7);
        System.out.println("삼각형 넓이 : " + triangle.getArea());

        // 밑변, 높이 숫자 변경
        // triangle.baseLine = 15;
        triangle.setBaseLine(15);
        System.out.println("삼각형 넓이 : " + triangle.getArea());

        triangle.setBaseLine(10);
        triangle.setHeight(8);

        System.out.println("삼각형 넓이 : " + triangle.getArea());
    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
