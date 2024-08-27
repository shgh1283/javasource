package classtest;

import java.util.Scanner;

public class AccountEx2 {
    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("======================================================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("======================================================\n");
            System.out.print("번호를 입력해 주세요\n");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 계좌 생성 메소드 호출
                    creatAccount();
                    break;
                case 2:
                    // 계좌 목록 메소드 호출
                    accountList();
                    break;
                case 3:
                    deposit();
                    ;
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");

                    break;

                default:
                    System.out.println("메뉴 번호를 확인해주세요.");
                    break;
            }

        }

    }

    static void creatAccount() {
        // 계좌생성 담당 메소드
        // 계좌와 관련된 정보 입력받기(계좌번호, 이름, 금액)
        System.out.print("계좌 번호 >> ");
        String accountNo = sc.nextLine();

        System.out.print("이름 >> ");
        String owner = sc.nextLine();
        System.out.print("금액 >> ");
        int balance = Integer.parseInt(sc.nextLine());

        // 배열 요소에서 빈 공간 찾아서 채우기
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                System.out.print("계좌생성이 완료되었습니다.\n");
                break;
            }
        }
        accounts[0] = new Account(accountNo, owner, balance);

        // accounts[특정 인덱스] = new Account("111-12-222","성춘향",10000);
    }

    static void accountList() {

        System.out.println("=========================");
        System.out.println("계좌        이름         잔액");
        System.out.println("=========================");
        for (Account account : accounts) {
            if (account != null) {

                System.out.printf("%s\t/\t%s\t/\t%d\n", account.getAccountNo(), account.getOwner(),
                        account.getBalance());

            }
        } // 현재 생성된 계좌목록 출력

    }

    static void deposit() {
        // 예금하기
        // 계좌번호와 예금액 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌 번호 >>");
        String accoutsNo = sc.nextLine();
        System.out.println("입금할 금액을 입력하시오.");
        int amount = Integer.parseInt(sc.nextLine());

        // 배열요소에서 일치하는 계좌번호를 찾기
        Account account = findAccount(accoutsNo);
        if (account != null) {
            account.deposit(amount);

        }
        // 찾은 account의 deposit() 호출

    }

    static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌 번호 >>");
        String accoutsNo = sc.nextLine();
        System.out.println("출금할 금액을 입력하시오.");
        int amount = sc.nextInt();
        Account account = findAccount(accoutsNo);
        if (account != null) {
            account.withdraw(amount);

        }

    }

    static Account findAccount(String accountNo) {
        // 일치하는 account 리턴
        for (Account account : accounts) {
            if (account != null) {
                if (accountNo.equals(account.getAccountNo())) {

                    return account;
                }
            }
            return null;
        }
        return null;
    }
}
