package ch07.sec10;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe();
        dog.sound();

        animalSound(dog);

        Animal animal = dog;
        animal.breathe();
        animal.sound();
    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
}
