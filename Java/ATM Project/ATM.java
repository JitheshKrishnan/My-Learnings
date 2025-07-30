import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User{
    
    int accountNumber;
    int pin;
    double balance;
    List<String> transactionHistory;
    
    public User(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public User(int accountNumber, int pin, double balance, List<String> transactionHistory) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }
    
    public boolean checkPin(int pin){
        return this.pin==pin;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        addTransaction("Amount $" + amount + " credited to account " + accountNumber);
    }

    public boolean withdraw(double amount){
        if(balance > amount){
            balance = balance-amount;
            addTransaction("Amount $" + amount + " debited from account " + accountNumber + ". Remaining balance: $" + balance);
            return true;
        }
        else
            return false;
    }

    public void addTransaction(String detail){
        transactionHistory.add(detail);
    }

    public List<String> getTransactionHistory(){
        return transactionHistory;
    }

    @Override
    public String toString(){
        return "User {Account Number: " + accountNumber + ", Balance Amount: $" + balance + "}";
    } 
}

class ATMSystem{

    List<User> users;
    User currentUser;
    int attempts;
    Scanner scanner;

    public ATMSystem(Scanner scanner) {
        
        this.scanner = scanner;
        attempts = 3;
        users = new ArrayList<User>();
        currentUser = null;
        
        users.add(new User(12345, 1111, 6000, new ArrayList<>()));
        users.add(new User(67890, 2222, 4000, new ArrayList<>()));
    }

    public void startATM(){
        System.out.println();
        System.out.print("Enter Account Number: ");
        int acNumber = scanner.nextInt();
        for(User user : users){
            if(user.accountNumber == acNumber){
                while(attempts != 0){
                    System.out.println();
                    System.out.print("Enter Pin: ");
                    int acPin = scanner.nextInt();
                    if(user.checkPin(acPin)){
                        System.out.println();
                        System.out.println("Login Success!");
                        currentUser = user;
                        displayMenu();
                        return;                      
                    }
                    else{
                        attempts--;
                        if(attempts!=0){
                            System.out.println("Incorrect Pin! Try again.");
                        }
                        else{
                            System.out.println("Incorrect Pin!");
                        }
                        System.out.println("Attempts Left: " + attempts);
                    }
                }
                System.out.println("Authentication Failed. Card Blocked!");
                return;
            }
        }
        System.out.println("Account Not Found");
    }

    public int displayMenu(){
        while(true){
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Please Select Option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Account Balance: " + currentUser.balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to be deposited: ");
                    double depositAmount = scanner.nextDouble();
                    currentUser.deposit(depositAmount);
                    System.out.println("Amount $" + depositAmount + " credited to account " + currentUser.accountNumber);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if(currentUser.withdraw(withdrawAmount)){
                        System.out.println("Amount $" + withdrawAmount + " debited from account " + currentUser.accountNumber + ". Remaining balance: $" + currentUser.balance);
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 4:
                    System.out.println("Transaction History:");
                    if(currentUser.getTransactionHistory().isEmpty()){
                        System.out.println("No Transactions Yet");
                    }
                    else{
                        for(String txt : currentUser.getTransactionHistory()){
                        System.out.println(txt);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM!");
                    return 1;
                default:
                    System.out.println("Please select the choice from 1 to 5");
                    break;
            }
        }
    }
}
public class ATM{
    public static void main(String a[]){
        Scanner scanner = new Scanner(System.in);
        ATMSystem atm = new ATMSystem(scanner);
        atm.startATM();
        scanner.close();
    }
}