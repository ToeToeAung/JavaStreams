package Streams.StreamEx16;

public class Account {
    private String ownerName;
    private int balance;
    private int acctId;
    public Account(String ownerName, int balance, int acctId) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.acctId = acctId;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }
}
