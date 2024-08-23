<<<<<<< HEAD
package Array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "\t");
            char[] chArr = names[i].toCharArray();
            System.out.println();

            // System.out.println(Arrays.toString(chArr));

            for (int j = 0; j < chArr.length; j++) {
                int pos = (int) (Math.random() * chArr.length);

                char temp = chArr[j];
                chArr[j] = chArr[pos];
                chArr[pos] = temp;

            }
            System.out.println(new String(chArr));
        }

    }
}
=======
package Array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "\t");
            char[] chArr = names[i].toCharArray();
            System.out.println();

            // System.out.println(Arrays.toString(chArr));

            for (int j = 0; j < chArr.length; j++) {
                int pos = (int) (Math.random() * chArr.length);

                char temp = chArr[j];
                chArr[j] = chArr[pos];
                chArr[pos] = temp;

            }
            System.out.println(new String(chArr));
        }

    }
}
>>>>>>> 8fb3c43ce24d560ffef718907051cefbd1ad3df3
