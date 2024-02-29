import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
    /*@Test
    public void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("Str", 2, 3.5f);
        Box<String, Integer, Float> box2 = new Box<>("Str", 5, 6.5f);
        float result = box1.getValue() + box1.getValue2() + box2.getValue() + box2.getValue2();
        assertEquals(17, result, 0.001);
    }*/
    @Test
    public void testBox() {
        List<Integer> numbers = new ArrayList<>();
        Generics.Box.method(numbers);
    }
}
