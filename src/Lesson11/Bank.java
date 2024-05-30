package Lesson11;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void blockAccount(BankAccount account) {
        account.setBlocked(true);
        System.out.println("Account blocked.");
    }

    public void unblockAccount(BankAccount account) {
        account.setBlocked(false);
        System.out.println("Account unblocked.");
    }

}
