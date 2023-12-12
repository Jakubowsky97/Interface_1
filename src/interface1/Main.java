package interface1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        dog.giveVoice();
        dog.running();

        Bird bird = new Bird("Sikorka");
        bird.giveVoice();
        bird.flying();

        Fish fish = new Fish("Salmon");
        fish.giveVoice();
        fish.swimming();

        FlyingFish fish1 = new FlyingFish("Szczupak");
        fish1.flying();
        fish1.swimming();
    }
}