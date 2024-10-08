package exception;

public class Account {
    // 계좌번호 (accountNo) : 101-11-12345
    // 계좌주(owner) : 홍길동
    // 잔액(balance) : 1000000
    private String accountNo;
    private String owner;
    private int balance;

    public Account(String accountNo, String owner, int balance) {
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

    public void setBalance(int balance) {
        this.balance = balance;
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
            // throw new Exception(" 잔액 부족 ");
            throw new RuntimeException("잔액 부족");
        }
        // 출금하다 (withdraw)
        balance = balance - amount; // 잔액 = 잔액 - 출금액

        return balance; // 잔액 return
    }

}
