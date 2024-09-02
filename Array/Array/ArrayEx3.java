package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char 배열 선언, 생성
        // 타입[] 배열명
        // 타입 배열명[]
        char[] chArr = { 'a', 'b', 'c', 'd' };

        System.out.println(Arrays.toString(chArr));
        for (int i = 0; i < chArr[i]; i++) {
            System.out.print(chArr[i] + "\t");
        }

        // 향상된 for문
        for (char c : chArr) {
            System.out.print(c + "\t");
        }

        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };
        for (float f : flArr) {
            System.out.println(f);
        }

        // String 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };

        for (String string : strArr) {
            System.out.print(string + "\t");
        }

        // ArrayIndexOutOfBoundsException
        // System.out.println(strArr[4]);
    }
}
