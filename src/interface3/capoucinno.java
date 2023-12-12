package interface3;

public class capoucinno extends coffee implements Ekspres {
    public capoucinno() {
    }

    @Override
    public void makeCoffe() {
        super.setName("cappuccino");
        super.setAmmountOfWater(350);
        super.setWeightOfCoffeeBins(60);
        super.setAmmountOfMilk(80);
    }

    @Override
    public void displayCoffee() {
        System.out.println(super.getName() + ": ziarno " + super.getWeightOfCoffeeBins() + ", woda " + super.getAmmountOfWater() + ", mleko " + super.getAmmountOfMilk());
    }

    @Override
    public void makeDoubleCoffe() {
        makeCoffe();
        super.setName("Double cappuccino");
        super.setAmmountOfWater(super.getAmmountOfWater() * 2);
        super.setWeightOfCoffeeBins(super.getWeightOfCoffeeBins() * 2);
        super.setAmmountOfMilk(super.getAmmountOfMilk() * 2);
    }

    @Override
    public String toString() {
        return "americano{" + super.toString() +
                ", milk= " + getAmmountOfMilk() +
                "}";
    }
}
