//! Topics: Array, Hash Table, Design, Simulation

//? Medium Difficulty

//* My Solution: 101ms

class Bank {

    private long[] balance;
    private int accounts;

    public Bank(long[] balance) {
        this.balance = balance;
        this.accounts = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1-1 > accounts || account2-1 > accounts || money > balance[account1-1]) return false;
        balance[account1-1] -= money;
        balance[account2-1] += money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account-1 >= accounts) return false;
        balance[account-1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account-1 > accounts || money > balance[account-1]) return false;
        balance[account-1] -= money;
        return true;
    }
}

public class SimpleBankSystem_2043 {
    public static void main(String[] args) {
        long[] balance = {10, 100, 20, 50, 30};
        Bank bank = new Bank(balance);
        System.out.println(bank.withdraw(3, 10));
        System.out.println(bank.transfer(5, 1, 20));
        System.out.println(bank.deposit(5, 20));
        System.out.println(bank.transfer(3, 4, 15));
        System.out.println(bank.withdraw(10, 50));
    }
}