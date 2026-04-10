package level1.animal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DogTest {

    @Test
    void getTypeLabel_should_return_dog() {
        Dog dog = new Dog("ポチ");
        assertEquals("犬", dog.getTypeLabel());
    }
}