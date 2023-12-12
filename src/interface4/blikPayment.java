package interface4;

import java.util.Scanner;

public class blikPayment implements PaymentMethod {

    @Override
    public void makePayment(Double ammount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod bilk.");
        int kodBlik = scanner.nextInt();
        System.out.println("Wypłata z konta");
        System.out.printf("Zapłacono kwote %.2fzł\n ", ammount);
    }
}
