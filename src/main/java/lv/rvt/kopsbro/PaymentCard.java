package lv.rvt.kopsbro;

public class PaymentCard {
    private double balance;
    private double amount;

    public PaymentCard(double balance) {
        this.balance = balance;
        this.amount=amount;
    }
    
    public String toString() {
    
        return String.format("Your balance is: %s%n",balance );
    }
    public void eatAffordably() {
        if (balance >= 2.60){
            balance-=2.60;
        }
    }
    
    public void eatHeartily() {
        if(balance>=4.60){
            balance-=4.60;
        }
    }

    public void addMoney(double amount) {
       if (amount>0){
        balance += amount;
       if (balance >= 150.0){
            balance = 150.0;
       }}
    }
}
