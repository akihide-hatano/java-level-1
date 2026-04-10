package level1.animal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    @Test
    void getTypeLabel_should_return_bird() {
        Bird bird = new Bird("ピーちゃん");
        assertEquals("鳥", bird.getTypeLabel());
    }

    @Test
    void bird_shouldImplementFlyable() {
        Bird bird = new Bird("ピーちゃん");
        assertTrue(bird instanceof Flyable);
    }
}