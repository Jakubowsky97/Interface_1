package interface3;

public class coffee {
    private String name;
    private double weightOfCoffeeBins;
    private double ammountOfWater;
    private double ammountOfMilk;

    public coffee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightOfCoffeeBins() {
        return weightOfCoffeeBins;
    }

    public void setWeightOfCoffeeBins(double weightOfCoffeeBins) {
        this.weightOfCoffeeBins = weightOfCoffeeBins;
    }

    public double getAmmountOfWater() {
        return ammountOfWater;
    }

    public void setAmmountOfWater(double ammountOfWater) {
        this.ammountOfWater = ammountOfWater;
    }

    public double getAmmountOfMilk() {
        return ammountOfMilk;
    }

    public void setAmmountOfMilk(double ammountOfMilk) {
        this.ammountOfMilk = ammountOfMilk;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", weightOfCoffeeBins=" + weightOfCoffeeBins +
                ", ammountOfWater=" + ammountOfWater;
    }
}
