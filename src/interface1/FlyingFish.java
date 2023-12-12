package interface1;

public class FlyingFish implements flyable, swimable {
    private String name;

    public FlyingFish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void flying() {
        System.out.println("Fru fru");
    }

    @Override
    public void swimming() {
        System.out.println("bul bul");
    }
}
