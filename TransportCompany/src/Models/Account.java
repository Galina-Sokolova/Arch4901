package Models;

public class Account {
    private long cardNumber;
    private int balance;

    public Account(long cardNumber, int balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getCard() {
        return cardNumber;
    }


}
