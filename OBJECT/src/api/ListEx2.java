<<<<<<< HEAD
package api;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("hong123", "홍길동"));
        list.add(new Member("kim123", "김길동"));
        list.add(new Member("lee123", "이길동"));
        list.add(new Member("park123", "박길동"));

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        System.out.println(list);

        for (Member member : list) {
            String id = member.getId();
            String name = member.getName();
        }
    }
}
=======
package api;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("hong123", "홍길동"));
        list.add(new Member("kim123", "김길동"));
        list.add(new Member("lee123", "이길동"));
        list.add(new Member("park123", "박길동"));

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        System.out.println(list);
    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
