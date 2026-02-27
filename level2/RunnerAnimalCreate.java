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

            if (animal instanceof Bird) {
                System.out.println("→ これは鳥です");
            }else if (animal instanceof Dog){
                System.out.println("→ これは犬です");
            }else{
                System.out.println("→ その他の動物");
            }
            System.out.println("-------------");
        }
    }
}