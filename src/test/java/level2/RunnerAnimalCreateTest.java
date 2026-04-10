package level2;

import level1.animal.Animal;
import level1.animal.Bird;
import level1.animal.Cat;
import level1.animal.Dog;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RUnnerAnimalCreateTest {

    @Test
    void animals_should_return_correct_labels(){
        Animal[] animals = {
            new Dog("Pochi"),
            new Cat("Mini"),
            new Bird("Pipi")
        };

        assertEquals("犬", animals[0].getTypeLabel());
        assertEquals("猫", animals[1].getTypeLabel());
        assertEquals("鳥", animals[2].getTypeLabel());
    }
}