package hello;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long iD;

	// The 'mappedBy = "account"' attribute specifies that
	// the 'private Accounts account;' field in Transactions owns the
	// relationship (i.e. contains the foreign key for the query to
	// find all transactions for an .
	@OneToMany(mappedBy = "account")
	private List<Transactions> transactions;

	private long accountNumber;

    private String accountType;

    private double balance;

	private double interestRate;

	private double overdraftPenalty;

	private double requiredMinimumBalance;

	private boolean isMinimumBalanceRequired;

	private boolean isOverdrawn;

	public long getiD() {
		return iD;
	}

	public void setiD(long iD) {
		this.iD = iD;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getOverdraftPenalty() {
		return overdraftPenalty;
	}

	public void setOverdraftPenalty(double overdraftPenalty) {
		this.overdraftPenalty = overdraftPenalty;
	}

	public double getRequiredMinimumBalance() {
		return requiredMinimumBalance;
	}

	public void setRequiredMinimumBalance(double requiredMinimumBalance) {
		this.requiredMinimumBalance = requiredMinimumBalance;
	}

	public boolean getIsMinimumBalanceRequired() {
		return isMinimumBalanceRequired;
	}

	public void setIsMinimumBalanceRequired(boolean isMinimumBalanceRequired) {
		this.isMinimumBalanceRequired = isMinimumBalanceRequired;
	}

	public boolean getIsOverdrawn() {
		return isOverdrawn;
	}

	public void setIsOverdrawn(boolean isOverdrawn) {
		this.isOverdrawn = isOverdrawn;
	}


}

