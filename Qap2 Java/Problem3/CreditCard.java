/**
 * CreditCard class represents a credit card with an owner, balance, and credit limit.
 */
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0.0);
        this.creditLimit = new Money(creditLimit); // Use copy constructor
    }

    // Get balance (return copy)
    public Money getBalance() {
        return new Money(balance);
    }

    // Get credit limit (return copy)
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get owner information as string
    public String getPersonals() {
        return owner.toString();
    }

    // Charge to credit card
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            this.balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Make payment
    public void payment(Money amount) {
        this.balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}