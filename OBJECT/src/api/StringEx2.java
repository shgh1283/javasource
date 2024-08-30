package api;

public class StringEx2 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }

    static int count(String src, String target) {
        // scr에서 target의 문자열이 몇 번 나오는지카운트한 후 리턴
        int count = 0;
        int pos = 0;

        // pos = src.indexOf(target,pos);
        // if (pos != -1)
        // count +=1;

        // pos +=target.length();
        // pos = src.indexOf(target, pos);

        // if (pos != -1) count +=1;
        // pos +=target.length();
        // pos = src.indexOf(target, pos);
        while ((pos = src.indexOf(target, pos)) != -1) {
            count += 1;
            pos += target.length();
        }

        return count;
    }
}
