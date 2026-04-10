package level2;

import level1.animal.*;

public class AnimalRunner {

    public static void main(String[] args){

        Animal[] animals = {
            new Dog("Pochi"),
            new Cat("Mini"),
            new Bird("Pipi")
        };

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}