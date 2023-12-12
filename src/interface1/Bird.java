package interface1;

public class Bird implements Animal, flyable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void giveVoice() {
        System.out.println("Fru Fru!");
    }

    @Override
    public void flying() {
        System.out.println("Flying");
    }
}
