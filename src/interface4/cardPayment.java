package interface4;

import java.util.Scanner;

public class cardPayment implements PaymentMethod{

    @Override
    public void makePayment(Double ammount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer karty");
        String numer = scanner.nextLine();
        System.out.println("Wypłata z karty o nr. " + numer);
        System.out.printf("Zapłacono kwote %.2fzł\n ", ammount);
    }
}
