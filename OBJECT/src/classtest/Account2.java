package classtest;

public class Account2 {
    // 계좌번호 (accountNo) : 101-11-12345
    // 계좌주(owner) : 홍길동
    // 잔액(balance) : 1000000
    private String accountNo;
    private String owner;
    private int balance;

    public Account2(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        // 기능
        balance += amount; // 예금하다 (deposit)
        // 리턴 없음
    }

    int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        // 출금하다 (withdraw)
        balance = balance - amount; // 잔액 = 잔액 - 출금액

        return balance; // 잔액 return
    }

    @Override
    public String toString() {
        return "Account2 [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
