    package interface3;

public class Main {
    public static void main(String[] args) {
        esspresso Esspresso = new esspresso();
        Esspresso.makeCoffe();
        Esspresso.makeDoubleCoffe();

        capoucinno Cappu = new capoucinno();
        Cappu.makeCoffe();
        Cappu.makeDoubleCoffe();

        Esspresso.displayCoffee();
        Cappu.displayCoffee();
    }
}
