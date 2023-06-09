package model;

import java.util.Date;

// Represents a transaction record having username, account type (chequing / saving), date
// and amount deposited and/or withdrawn
public class TransactionRecord {

    private final String username;
    private final String accountType;
    private final String transactionType;
    private final String date;
    private final double transactionAmount;

    // EFFECTS: create a transaction record given date, username, account type and transaction amount
    public TransactionRecord(String username, String accountType, String transactionType,
                             String date, double transactionAmount) {
        this.username = username;
        this.accountType = accountType;
        this.transactionType = transactionType;
        this.date = date;
        this.transactionAmount = transactionAmount;
        EventLog.getInstance().logEvent(new Event("A transaction record created"));
    }

    public String getUsername() {
        return this.username;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public double getTransactionAmount() {
        return this.transactionAmount;
    }

    public String getDate() {
        return this.date;
    }
}
