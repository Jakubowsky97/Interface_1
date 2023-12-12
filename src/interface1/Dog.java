package interface1;

public class Dog implements Animal, runnableAnimal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void giveVoice() {
        System.out.println("Woof!");
    }

    @Override
    public void running() {
        System.out.println("Running and jumping");
    }
}
