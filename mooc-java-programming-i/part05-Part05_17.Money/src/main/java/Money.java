
import java.math.BigDecimal;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public int totalCents() {
        return this.euros * 100 + this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {

        // create a new Money object that has the correct worth
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        Money newMoney = new Money(newEuros, newCents);

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        return this.totalCents() < compared.totalCents();
    }

    public Money minus(Money decreaser) {
        int cents = 0;
        int euros = 0;
        if (this.totalCents() > decreaser.totalCents()) {
            int rest = this.totalCents() - decreaser.totalCents();
            euros = (int) rest / 100;

            cents = rest % 100;
            
        }
        Money newMoney = new Money(euros, cents);
        return newMoney;
    }
}
