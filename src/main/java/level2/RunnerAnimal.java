package level2;

import level1.animal.*;

public class RunnerAnimal {

    public static void main(String[] args) {

        //犬の設定
        Dog dog = new Dog("Pochi");
        dog.speak();

        //猫の設定
        Cat cat = new Cat("Mimi");
        cat.speak();

        //鳥の設定
        Bird bird = new Bird("HORK");
        bird.speak();
    }
}