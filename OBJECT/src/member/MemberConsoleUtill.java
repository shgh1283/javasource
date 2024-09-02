<<<<<<< HEAD
package member;

import java.util.Scanner;

public class MemberConsoleUtill {

    public Member addMember(Scanner sc) {
        // 회원 한 명에 대한 정보 입력 받기
        // 입력받은 정보로 Member 인스턴스를 생성 후 리턴
        // System.out.println("회원 정보 입력");
        // System.out.println("ID : ");
        // String id = sc.nextLine();
        // System.out.println("이름 : ");
        // String name = sc.nextLine();
        // System.out.println("주소 : ");
        // String addr = sc.nextLine();
        // System.out.println("이메일 : ");
        // String email = sc.nextLine();

        // return new Member(id, name, addr, email);
        Member member = new Member();

        System.out.println("회원 정보 입력");
        System.out.print("ID : ");
        member.setId(sc.nextLine());
        System.out.print("이름 : ");
        member.setName(sc.nextLine());
        System.out.print("주소 : ");
        member.setAddr(sc.nextLine());
        System.out.print("이메일 : ");
        member.setEmail(sc.nextLine());

        return member;

    }

    public void printMembers(Member[] members) {
        // members 정보 출력
        System.out.println();
        System.out.println("ID    이름    주소    이메일");
        // for (int i = 0; i < members.length; i++) {
        // if (members != null) {
        // System.out.println(members[i]);
        // }

        for (Member member : members) {
            if (member != null) {
                System.out.printf("%5s\t%5s\t%6s%10s\n", member.getId(), member.getName(), member.getAddr(),
                        member.getEmail());
            }
        }
    }

    public Member updateMember(Scanner sc, Member[] members) {
        // 주소 수정
        // 아이디 / 수정할 주소 입력받기
        System.out.println("수정할 회원 정보 입력");
        System.out.println("ID >>");
        String id = sc.nextLine();
        System.out.println("변경된 주소 >> ");
        String addr = sc.nextLine();

        // members 에서 일치하는 아이디 찾은 후 주소 변경
        for (Member member : members) {

            if (member != null) {

                if (member.getId().equals(id)) {
                    member.setAddr(addr);
                    return member;

                }
            }
        }

        // 수정된 member 리턴
        return null;
    }

    public void removeMember(Scanner sc, Member[] members) {
        System.out.println("삭제할 회원 정보 입력");
        System.out.println("ID >>");
        String id = sc.nextLine();
        for (int i = 0; i < members.length; i++) {
            if (members[i] != null) {
                if (members[i].getId().equals(id)) {
                    members[i] = null;
                    return;
                }
            }
        }
    }
}
=======
package member;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.Spring;

public class MemberConsoleUtill {

    public Member addMember(Scanner sc) {
        // 회원 한 명에 대한 정보 입력 받기
        // 입력받은 정보로 Member 인스턴스를 생성 후 리턴
        // System.out.println("회원 정보 입력");
        // System.out.println("ID : ");
        // String id = sc.nextLine();
        // System.out.println("이름 : ");
        // String name = sc.nextLine();
        // System.out.println("주소 : ");
        // String addr = sc.nextLine();
        // System.out.println("이메일 : ");
        // String email = sc.nextLine();

        // return new Member(id, name, addr, email);
        Member member = new Member();

        System.out.println("회원 정보 입력");
        System.out.print("ID : ");
        member.setId(sc.nextLine());
        System.out.print("이름 : ");
        member.setName(sc.nextLine());
        System.out.print("주소 : ");
        member.setAddr(sc.nextLine());
        System.out.print("이메일 : ");
        member.setEmail(sc.nextLine());

        return member;

    }

    public void printMembers(Member[] members) {
        // members 정보 출력
        System.out.println();
        System.out.println("ID    이름    주소    이메일");
        // for (int i = 0; i < members.length; i++) {
        // if (members != null) {
        // System.out.println(members[i]);
        // }

        for (Member member : members) {
            if (member != null) {
                System.out.printf("%5s\t%5s\t%6s%10s\n", member.getId(), member.getName(), member.getAddr(),
                        member.getEmail());
            }
        }
    }

    public Member updateMember(Scanner sc, Member[] members) {
        // 주소 수정
        // 아이디 / 수정할 주소 입력받기
        System.out.println("수정할 회원 정보 입력");
        System.out.println("ID >>");
        String id = sc.nextLine();
        System.out.println("변경된 주소 >> ");
        String addr = sc.nextLine();

        // members 에서 일치하는 아이디 찾은 후 주소 변경
        for (Member member : members) {

            if (member != null) {

                if (member.getId().equals(id)) {
                    member.setAddr(addr);
                    return member;

                }
            }
        }

        // 수정된 member 리턴
        return null;
    }

    public void removeMember(Scanner sc, Member[] members) {
        System.out.println("삭제할 회원 정보 입력");
        System.out.println("ID >>");
        String id = sc.nextLine();
        for (int i = 0; i < members.length; i++) {
            if (members[i] != null) {
                if (members[i].getId().equals(id)) {
                    members[i] = null;
                    return;
                }
            }
        }
    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
