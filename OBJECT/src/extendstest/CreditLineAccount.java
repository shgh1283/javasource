package extendstest;

// 은행계좌 + 마이너스 가능한 계좌
public class CreditLineAccount extends Account {

    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String accountNo, String owner, int balance, int creditLine) {
        // Constructor call must be the first statemen
        super(accountNo, owner, balance); // 부모의 생성자 호출
        this.creditLine = creditLine;

    }

    @Override
    int withdraw(int amount) {
        // 잔액 + 마이너스 한도 - 사용금액

        if (getBalance() + creditLine < amount) {

            return -1;

        }
        setBalance(getBalance() - amount);
        return getBalance();
    }

    public int getCreditLine() {

        return creditLine;
    }
}
