import java.util.*;

public class BankAccount {
    private String cardHolder;
    private String pin;
    private int cBalance;
    private int sBalance;

    public BankAccount(){}

    public BankAccount(String name, String pinNum)
    {
        setCardName(name);
        setPIN(pinNum);
    }

    public String getName() {
        return cardHolder;
    }

    public String getPIN() {
        return pin;
    }

    public int getCheckingBalance(){
        return cBalance;
    }

    public int getSavingsBalance(){
        return sBalance;
    }

    public void setCardName(String c){
        cardHolder = c;
    }

    public void setPIN(String p){
        pin = p;

    }

    public void setcBalance(int n){
        cBalance = n;
    }

    public void setsBalance(int n){
        sBalance = n;
    }

    public void addTocBalance(int amount)
    {
        if (amount > 0)  
        {
            cBalance += amount;
        }
    }

    public void addTosBalance(int amount)
    {
        if (amount > 0)  
        {
            sBalance += amount;
        }
    }

    public void subtractFromcBalance (double amount)
    {
        if (amount > 0)
        {
            cBalance -= amount;
        }
    }

    public void subtractFromsBalance (double amount)
    {
        if (amount > 0)
        {
            sBalance -= amount;
        }
    }

}
