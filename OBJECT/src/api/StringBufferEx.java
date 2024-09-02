<<<<<<< HEAD
package api;

public class StringBufferEx {
    public static void main(String[] args) {
        // 변경가능한(mutable)
        // StringBuffer : 스레드에 안전
        // StringBuilder

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        // equals() : Object가 상속해준 방식으로 사용
        System.out.println("sb.equals(sb2) : " + sb1.equals(sb2));
        System.out.println("sb1 == sb2 : " + (sb1 == sb2));

        // 값 비교? ==> String 으로 변환
        // toString() : StringBuffer => String
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        System.out.println(s1.equals(s2));

        System.out.println("append() : " + sb1.append("def"));
        System.out.println("insert() : " + sb1.insert(3, "hello"));
        System.out.println("delete() : " + sb1.delete(2, 5));
        System.out.println("replace() : " + sb1.replace(3, sb1.length(), "END"));

    }
}
=======
package api;

public class StringBufferEx {
    public static void main(String[] args) {
        // 변경가능한(mutable)
        // StringBuffer : 스레드에 안전
        // StringBuilder

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        // equals() : Object가 상속해준 방식으로 사용
        System.out.println("sb.equals(sb2) : " + sb1.equals(sb2));
        System.out.println("sb1 == sb2 : " + (sb1 == sb2));

        // 값 비교? ==> String 으로 변환
        // toString() : StringBuffer => String
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        System.out.println(s1.equals(s2));

        System.out.println("append() : " + sb1.append("def"));
        System.out.println("insert() : " + sb1.insert(3, "hello"));
        System.out.println("delete() : " + sb1.delete(2, 5));
        System.out.println("replace() : " + sb1.replace(3, sb1.length(), "END"));

    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
