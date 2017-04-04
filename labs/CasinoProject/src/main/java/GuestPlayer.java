/**
 * Created by latashawatson on 1/28/17.
 */
public class GuestPlayer extends Player {
    private String name;
    private double balance = 100.00;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount){
        double result = balance + amount;
        balance = result;
    }
}
