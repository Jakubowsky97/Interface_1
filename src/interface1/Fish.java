package interface1;

public class Fish implements Animal, swimable {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void giveVoice() {
        System.out.println("Bul Bul!");
    }

    @Override
    public void swimming() {
        System.out.println("Swimming");
    }
}
