package interface4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kwota do zapłaty");
        double kwota  = scanner.nextDouble();

        System.out.println("Jak chcesz zapłacić 1) Karta, 2) Blik, 3) Gotówka");
        int choice = scanner.nextInt();

        PaymentMethod paymentMethod = null;
        switch (choice) {
            case 1 -> {
                cardPayment card = new cardPayment();
            }
            case 2 -> {
                blikPayment blik = new blikPayment();
            }
            case 3 -> {
                payment bill = new payment();
            }
        }

        if(choice > 0 && choice < 4) {
            paymentMethod.makePayment(kwota);
        }
    }
}
