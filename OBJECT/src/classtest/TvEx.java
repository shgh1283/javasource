<<<<<<< HEAD
package classtest;

public class TvEx {
    public static void main(String[] args) {

        Tv tv = new Tv();

        // private 키워드가 붙은 경우에 외부에서 직접 호출 불가
        // System.out.println("현재 채널 : " + tv.channel);
        // System.out.println("현재 전원상태 : " + tv.power);
        // System.out.println("제조사 : " + tv.company);

        Tv tv2 = new Tv(7, true, "LG");

        // 메소드 호출
        int channel = tv2.getChannel();
        System.out.println("현재 채널 : " + tv2.getChannel());
        tv2.channelUp();
        System.out.println("현재 채널 : " + tv2.getChannel());
        tv2.power();
        System.out.println("현재 파워 상태 : " + tv2.isPower());
    }
}
=======
package classtest;

public class TvEx {
    public static void main(String[] args) {

        Tv tv = new Tv();

        // private 키워드가 붙은 경우에 외부에서 직접 호출 불가
        // System.out.println("현재 채널 : " + tv.channel);
        // System.out.println("현재 전원상태 : " + tv.power);
        // System.out.println("제조사 : " + tv.company);

        Tv tv2 = new Tv(7, true, "LG");

        // 메소드 호출
        int channel = tv2.getChannel();
        System.out.println("현재 채널 : " + tv2.getChannel());
        tv2.channelUp();
        System.out.println("현재 채널 : " + tv2.getChannel());
        tv2.power();
        System.out.println("현재 파워 상태 : " + tv2.isPower());
    }
}
>>>>>>> ed2c435241f44c6a1c804d573ef7af61a47d6ca4
