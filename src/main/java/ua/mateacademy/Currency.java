package ua.mateacademy;

/**
 * Created by Таня on 01.01.2019.
 */
public class Currency implements Asset {
    public void refill() {
        System.out.println("Your balance hac been successfully refill with currency");
    }

    public void withdraw() {
        System.out.println("You`ve successfully withdrawn currency");
    }

    public void checkBalance() {
        System.out.println("Balance: currency");
    }
}
