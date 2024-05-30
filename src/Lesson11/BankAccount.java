package Lesson11;

public class BankAccount {
    private double money;
    private boolean blocked;
    private String accountName;

    public BankAccount(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BankAccount() {
        this.money = 0;
        this.blocked = false;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void TopUpCard(double sum) {
        setMoney(getMoney() + sum);
    }

    public void WithdrawalOfFunds(double sum) {
        if (blocked == false) {
            if (getMoney() >= sum) {
                setMoney(getMoney() - sum);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("The account is blocked. Therefore, withdrawals are not possible.");
        }

    }
    public void printBankAccount() {
        System.out.println(money);
    }

    public void transferMoney(BankAccount destinationAccount, double sum) {
        if (blocked == false) {
            if (getMoney() >= sum) {
                WithdrawalOfFunds(sum);
                destinationAccount.TopUpCard(sum);
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Insufficient funds for transfer.");
            }
        } else {
            System.out.println("The account is blocked. Therefore, fund transfers are not possible");
        }

    }
    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
