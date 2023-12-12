    package interface3;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        int madeCoffee = 0;
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while(choice != "q") {
            System.out.println("Wybierz kawę");
            System.out.println("1 - Cappuccino");
            System.out.println("2 - Espresso");
            System.out.println("3 - Double Cappuccino");
            System.out.println("4 - Double espresso");
            System.out.println("-------------------------------");
            System.out.println("test - Dane statystyczne");
            System.out.println("-------------------------------");
            System.out.println("q - Wyłącz ekspres");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    capoucinno cappuccino = new capoucinno();
                    cappuccino.makeCoffe();
                    cappuccino.displayCoffee();
                    madeCoffee++;
                    System.out.println("Wpisz cokolwiek aby przejść dalej");
                    scanner.nextLine();
                    break;
                case "2":
                    esspresso esspresso = new esspresso();
                    esspresso.makeCoffe();
                    esspresso.displayCoffee();
                    madeCoffee++;
                    System.out.println("Wpisz cokolwiek aby przejść dalej");
                    scanner.nextLine();
                    break;
                case "3":
                    capoucinno cappuccino_2x = new capoucinno();
                    cappuccino_2x.makeDoubleCoffe();
                    cappuccino_2x.displayCoffee();
                    madeCoffee++;
                    System.out.println("Wpisz cokolwiek aby przejść dalej");
                    scanner.nextLine();
                    break;
                case "4":
                    esspresso esspresso_2x = new esspresso();
                    esspresso_2x.makeDoubleCoffe();
                    esspresso_2x.displayCoffee();
                    madeCoffee++;
                    System.out.println("Wpisz cokolwiek aby przejść dalej");
                    scanner.nextLine();
                    break;
                case "test":
                    System.out.println("ile - Ilość sztuk zrobionych przez ekspres");
                    String choice1 = scanner.nextLine();
                    switch (choice1) {
                        case "ile":
                            System.out.println("Ekspres zrobił " + madeCoffee);
                            System.out.println("Wpisz cokolwiek aby przejść dalej");
                            scanner.nextLine();

                    }
                    break;
                case "q":
                    System.exit(0);
                    break;
            }
        }
    }
}
