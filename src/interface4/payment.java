package interface4;

import java.util.Scanner;

public class payment implements PaymentMethod {

    @Override
    public void makePayment(Double ammount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę wpłaconą do kasiera");
        double value = scanner.nextDouble();
        System.out.println("Zapłacono gotówką kwotę: " + value);
        System.out.printf("Reszta: %.2f", (value - ammount));
    }
}
