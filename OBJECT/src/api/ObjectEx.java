<<<<<<< HEAD
package api;

public class ObjectEx {
    public static void main(String[] args) {
        // java.lang.Object : root 클래스

        // 인스턴스 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 주소 비교
        System.out.println(obj1.equals(obj2) ? " 같다" : "다르다");
        System.out.println(obj1 == obj2 ? " 같다" : "다르다");

        System.out.println(obj1.toString()); // java.lang.Object@5ca881b5
        System.out.println(obj2.toString()); // java.lang.Object@24d46ca6

        // 사용자 지정 클래스
        // 값이 같으면 true를 만들기 위해 eqauls() 재정의

        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2) ? " 같다" : "다르다");
        // 객체가 가지고 있는 값의 출력으로 바꾸려면 toString() 재정의
        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}
=======
package api;

public class ObjectEx {
    public static void main(String[] args) {
        // java.lang.Object : root 클래스

        // 인스턴스 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 주소 비교
        System.out.println(obj1.equals(obj2) ? " 같다" : "다르다");
        System.out.println(obj1 == obj2 ? " 같다" : "다르다");

        System.out.println(obj1.toString()); // java.lang.Object@5ca881b5
        System.out.println(obj2.toString()); // java.lang.Object@24d46ca6

        // 사용자 지정 클래스
        // 값이 같으면 true를 만들기 위해 eqauls() 재정의

        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2) ? " 같다" : "다르다");
        // 객체가 가지고 있는 값의 출력으로 바꾸려면 toString() 재정의
        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
