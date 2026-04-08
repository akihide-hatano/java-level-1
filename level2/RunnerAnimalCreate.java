package level2;

import level1.animal.*;

public class RunnerAnimalCreate {

    public static void main(String[] args){
        Animal[] animals = createAnimals();
        processAnimals(animals);
    }

    //配列を作る責務
    private static Animal[] createAnimals(){
        return new Animal[]{
            new Dog("POchi"),
            new Cat("Mimi"),
            new Bird("Pipi")
        };
    }

    private static void processAnimals(Animal[] animals){

        for(Animal animal : animals){
            System.out.println("-------------");
            System.out.println("これは" + animal.getTypeLabel());
            System.out.println("-------------");
        }
    }
}