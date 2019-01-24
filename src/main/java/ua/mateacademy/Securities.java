package ua.mateacademy;

/**
 * Created by Таня on 01.01.2019.
 */
public class Securities implements Asset {
    public void refill() {
        System.out.println("Your balance hac been successfully refill with securities");
    }

    public void withdraw() {
        System.out.println("You`ve successfully withdrawn securities");
    }

    public void checkBalance() {
        System.out.println("Balance: securities");
    }

    public void checkBalance(int i) {
        System.out.println("Balance: securities");
    }
}
