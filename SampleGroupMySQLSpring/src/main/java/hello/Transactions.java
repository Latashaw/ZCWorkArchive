package hello;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long iD;

    // adds accountID column with a foreign key. And creates a join to
    // lazily fetch the owner (LAZY means load only when data is requested so there aren't any load-time issues)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountID")
    //This is the "account" specified in Accounts to manage the foreign key connection between two classes
    private Accounts account;

    private long transactionNumber;

    private double credits;

    private double debits;

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }

    public hello.Accounts getAccount() {
        return account;
    }

    public void setAccount(hello.Accounts account) {
        this.account = account;
    }

    public long getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(long transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getDebits() {
        return debits;
    }

    public void setDebits(double debits) {
        this.debits = debits;
    }
}

