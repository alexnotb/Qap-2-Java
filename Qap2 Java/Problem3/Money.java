/**
 * Money class represents a monetary amount with dollars and cents.
 */
public class Money {
    private long dollars;
    private int cents;

    // Constructor with double value
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (int) Math.round((amount - dollars) * 100);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Getters
    public long getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // Add money
    public Money add(Money other) {
        long totalCents = this.dollars * 100 + this.cents + other.dollars * 100 + other.cents;
        return new Money(totalCents / 100.0);
    }

    // Subtract money
    public Money subtract(Money other) {
        long totalCents = this.dollars * 100 + this.cents - (other.dollars * 100 + other.cents);
        return new Money(totalCents / 100.0);
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Money)) return false;
        Money other = (Money) obj;
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // CompareTo method
    public int compareTo(Money other) {
        long thisCents = this.dollars * 100 + this.cents;
        long otherCents = other.dollars * 100 + other.cents;
        return Long.compare(thisCents, otherCents);
    }

    // toString method
    @Override
    public String toString() {
        return String.format("$%.2f", dollars + cents / 100.0);
    }
}