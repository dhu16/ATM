import java.util.*;

public class ATM extends BankAccount {

    private static Scanner s = new Scanner(System.in);

    public static void verifyCustomer(BankAccount b)
    {
        System.out.println("Enter Card Holder's Name: ");
        String user;
        user = s.nextLine();
        System.out.println("Enter PIN: ");
        String pin;
        pin = s.nextLine();
         
        if (user.equals(b.getName()) && pin.equals(b.getPIN()))
        {
                menu();
        }
        else
        {
            System.out.println("ERROR: Either card or PIN is not correct."); 
        }
    }

    public static void menu()
    {
        System.out.println("Welcome to the bank");
        System.out.println("Choose one of the following options: ");
        System.out.println("1 - Sign In");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Display Account Info");
        System.out.println("5 - Exit");
    }

    public static void deposit(BankAccount b){
        System.out.println("Would you like to deposit to your checkings or savings account? ");
        String choice = s.next();

        System.out.println("How much would you like to deposit? ");
        int amt = s.nextInt();

        if(choice.toLowerCase().equals("checking")){
            b.addTocBalance(amt);
        } else if(choice.toLowerCase().equals("savings")){
            b.addTosBalance(amt);
        } else {
            System.out.println("ERROR: Choose valid option."); 
        }
    }

    public static void withdraw(BankAccount b){
        System.out.println("Would you like to withdraw from your checkings or savings account? ");
        String choice = s.next();

        System.out.println("How much would you like to withdraw? ");
        int amt = s.nextInt();

        if(choice.toLowerCase().equals("checking")){
            b.subtractFromcBalance(amt);
        } else if(choice.toLowerCase().equals("savings")){
            b.subtractFromsBalance(amt);
        } else {
            System.out.println("ERROR: Choose valid option."); 
        }
    }

    public static void showBalance(BankAccount b){
        System.out.println("Would you like to view your checking or savings balance? ");
        String choice = s.next();

        if(choice.toLowerCase().equals("checking")){
            System.out.println("Your current checking account balance is: " + b.getCheckingBalance());
        } else if(choice.toLowerCase().equals("savings")){
            System.out.println("Your current savings account balance is: " + b.getSavingsBalance());
        } else {
            System.out.println("ERROR: Choose valid option."); 
        }
    }

    public static void main(String[] args){
        BankAccount b = new BankAccount("Daniel", "1234");
        b.setCardName("Daniel");
        b.setPIN("1234");
        b.setcBalance(1000);

        verifyCustomer(b);

        String option;
        do {
            menu();
            option = s.next();
            
            switch(option)
            {
            case "1":
                verifyCustomer(b);
                break;
            case "2":
                deposit(b);
                break;
            case "3":
                withdraw(b);
                break;
            case "4":
                showBalance(b);
                break;
            case "5":
                System.out.println("Signed out of account.");
                break;
            }
        } while(!option.equals("5"));

        s.close();
    }
}
