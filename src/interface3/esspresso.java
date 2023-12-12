package interface3;

public class esspresso extends coffee implements Ekspres {
    public esspresso() {
    }

    @Override
    public void makeCoffe()  {
        super.setName("esspresso");
        super.setWeightOfCoffeeBins(50);
        super.setAmmountOfWater(100);
    }

    @Override
    public void displayCoffee() {
        System.out.println(super.getName() + ": ziarno " + super.getWeightOfCoffeeBins() + ", woda" + super.getAmmountOfWater());
    }

    @Override
    public void makeDoubleCoffe() {
        makeCoffe();
        super.setName("Double espresso");
        super.setAmmountOfWater(super.getAmmountOfWater() * 2);
        super.setWeightOfCoffeeBins(super.getWeightOfCoffeeBins() * 2);
    }

    @Override
    public String toString() {
        return "americano{" + super.toString() +
                "}";
    }
}
